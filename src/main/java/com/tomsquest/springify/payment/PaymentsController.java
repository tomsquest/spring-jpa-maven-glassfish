package com.tomsquest.springify.payment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tomsquest.springify.model.Payment;

@Controller
@RequestMapping("/payments.html")
public class PaymentsController {

	@Autowired
	private PaymentService paymentService;

	@RequestMapping
	public void list(final ModelMap model) {
		List<Payment> payments = paymentService.findAll();

		model.addAttribute("payments", payments);
	}
}
