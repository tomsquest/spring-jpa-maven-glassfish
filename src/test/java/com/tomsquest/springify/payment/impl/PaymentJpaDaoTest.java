package com.tomsquest.springify.payment.impl;

import java.util.List;

import org.junit.Test;

import com.tomsquest.springify.AbstractIntegrationTest;
import com.tomsquest.springify.model.Payment;
import com.tomsquest.springify.payment.PaymentDao;

public class PaymentJpaDaoTest extends AbstractIntegrationTest {

	private PaymentDao paymentDao;

	public void setPaymentDao(final PaymentDao paymentDao) {
		this.paymentDao = paymentDao;
	}

	@Test
	public void testFindAll() {
		List<Payment> payments = paymentDao.findAll();
		assertNotNull(payments);
		assertEquals(4, payments.size());
	}

	@Test
	public void testFindById() {
		Long id = new Long(1);

		Payment payment = paymentDao.findById(id);

		assertNotNull(payment);
		assertEquals(id, payment.getId());
	}
}
