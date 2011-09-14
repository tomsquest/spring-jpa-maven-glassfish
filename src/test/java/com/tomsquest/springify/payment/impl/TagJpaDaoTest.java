package com.tomsquest.springify.payment.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tomsquest.springify.AbstractIntegrationTest;
import com.tomsquest.springify.model.Payment;
import com.tomsquest.springify.model.Tag;

public class TagJpaDaoTest extends AbstractIntegrationTest {

	@Autowired
	private TagJpaDao tagJpaDao;

	@Test
	public void testFindById() {
		Long id = new Long(1);

		Tag tag = tagJpaDao.findById(id);

		assertNotNull(tag);
		assertEquals(id, tag.getId());
	}

	@Test
	public void testFindAll() {
		List<Tag> tags = tagJpaDao.findAll();
		assertNotNull("tags");
		assertEquals(2, tags.size());
	}

	@Test
	public void testFindByTag() {
		Tag tag = tagJpaDao.findById(new Long(1));

		List<Payment> payments = tagJpaDao.findByTag(tag);

		assertNotNull("tags");
		assertEquals(2, payments.size());
	}

	@Test
	public void testSaveTag() throws Exception {
		Tag tagToSave = new Tag("toto4");
		tagJpaDao.save(tagToSave);

		Tag savedTag = tagJpaDao.findById(tagToSave.getId());

		assertNotNull("tag");
		assertEquals(tagToSave, savedTag);
	}

	@Test
	public void testDeleteTag() throws Exception {
		Tag tag = tagJpaDao.findById(new Long(1));
		tagJpaDao.delete(tag);
		assertNull(tagJpaDao.findById(new Long(1)));
	}

	@Test
	public void testUpdateTag() throws Exception {
		Tag tag = tagJpaDao.findById(new Long(1));
		String expectedLabel = "other";
		tag.setLabel(expectedLabel);

		tagJpaDao.update(tag);

		assertEquals(expectedLabel, tagJpaDao.findById(new Long(1)).getLabel());
	}
}
