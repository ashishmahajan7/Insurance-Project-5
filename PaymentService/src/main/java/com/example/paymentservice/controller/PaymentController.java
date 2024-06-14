package com.example.paymentservice.controller;

import com.example.paymentservice.model.Payment;
import com.example.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	@GetMapping("/getAllPayments")
	public List<Payment> getAllPayments() {
		return paymentService.getAllPayments();
	}

	@GetMapping("/getPayment/{id}")
	public Payment getPaymentById(@PathVariable("id") Long paymentId) {
		return paymentService.getPaymentById(paymentId);
	}

	@PostMapping("/savePayment")
	public Payment createPayment(@RequestBody Payment payment) {
		return paymentService.createPayment(payment);
	}

	@PutMapping("/updatePayment/{id}")
	public Payment updatePayment(@PathVariable("id") Long paymentId, @RequestBody Payment paymentDetails) {
		return paymentService.updatePayment(paymentId, paymentDetails);
	}

	@DeleteMapping("/deletePayment/{id}")
	public void deletePayment(@PathVariable("id") Long paymentId) {
		paymentService.deletePayment(paymentId);
	}
}
