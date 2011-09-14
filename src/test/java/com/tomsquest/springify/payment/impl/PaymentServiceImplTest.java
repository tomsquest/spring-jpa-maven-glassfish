package com.tomsquest.springify.payment.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tomsquest.springify.AbstractIntegrationTest;
import com.tomsquest.springify.model.Payment;
import com.tomsquest.springify.payment.PaymentService;

public class PaymentServiceImplTest extends AbstractIntegrationTest {

	@Autowired
	private PaymentService paymentService;

	@Test
	public void testFindAll() {
		List<Payment> payments = paymentService.findAll();

		assertNotNull(payments);
	}

}
