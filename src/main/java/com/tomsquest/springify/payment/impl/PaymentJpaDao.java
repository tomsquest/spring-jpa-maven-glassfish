package com.tomsquest.springify.payment.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.tomsquest.springify.model.Payment;
import com.tomsquest.springify.payment.PaymentDao;

@Repository
public class PaymentJpaDao implements PaymentDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Payment findById(final Long id) {
		return em.find(Payment.class, id);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Payment> findAll() {
		return em.createQuery("Select distinct pay from Payment pay left join fetch pay.tags").getResultList();
	}

}
