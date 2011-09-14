package com.tomsquest.springify.payment;

import java.util.List;

import com.tomsquest.springify.model.Payment;

public interface PaymentDao {
	Payment findById(final Long id);

	List<Payment> findAll();
}