package com.tomsquest.springify.payment;

import java.util.List;

import com.tomsquest.springify.model.Payment;
import com.tomsquest.springify.model.Tag;

public interface TagDao {
	Tag findById(final Long id);

	List<Tag> findAll();

	List<Payment> findByTag(Tag tag);

	Long save(Tag tag);

	void update(Tag tag);

	void delete(Tag tag);
}