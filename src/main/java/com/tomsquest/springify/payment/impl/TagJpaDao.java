package com.tomsquest.springify.payment.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.tomsquest.springify.model.Payment;
import com.tomsquest.springify.model.Tag;
import com.tomsquest.springify.payment.TagDao;

@Repository
public class TagJpaDao implements TagDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Tag findById(final Long id) {
		return em.find(Tag.class, id);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Tag> findAll() {
		return em.createQuery("from Tag").getResultList();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Payment> findByTag(final Tag tag) {
		Query query = em.createQuery("From Payment p where :tag member of p.tags");
		query.setParameter("tag", tag);
		return query.getResultList();
	}

	@Override
	public Long save(final Tag tag) {
		em.persist(tag);
		return tag.getId();
	}

	@Override
	public void update(final Tag tag) {
		em.merge(tag);
	}

	@Override
	public void delete(final Tag tag) {
		em.remove(tag);
	}
}
