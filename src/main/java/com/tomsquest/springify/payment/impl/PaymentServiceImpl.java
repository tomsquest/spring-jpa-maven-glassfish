package com.tomsquest.springify.payment.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tomsquest.springify.model.Payment;
import com.tomsquest.springify.payment.PaymentDao;
import com.tomsquest.springify.payment.PaymentService;

@Service
@Transactional(readOnly = true)
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentDao paymentDao;

	@Override
	public List<Payment> findAll() {
		return paymentDao.findAll();
	}
}
