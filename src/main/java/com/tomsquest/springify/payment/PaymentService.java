package com.tomsquest.springify.payment;

import java.util.List;

import com.tomsquest.springify.model.Payment;

public interface PaymentService {
	List<Payment> findAll();
}
