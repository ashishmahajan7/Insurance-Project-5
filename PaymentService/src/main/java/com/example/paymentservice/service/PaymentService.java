package com.example.paymentservice.service;

import com.example.paymentservice.model.Payment;
import com.example.paymentservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;

	public List<Payment> getAllPayments() {
		return paymentRepository.findAll();
	}

	public Payment getPaymentById(Long id) {
		return paymentRepository.findById(id).orElse(null);
	}

	public Payment createPayment(Payment payment) {
		return paymentRepository.save(payment);
	}

	public Payment updatePayment(Long id, Payment paymentDetails) {
		Payment payment = paymentRepository.findById(id).orElse(null);

		if (payment != null) {
			payment.setBillId(paymentDetails.getBillId());
			payment.setAmountPaid(paymentDetails.getAmountPaid());
			payment.setAccountNumber(paymentDetails.getAccountNumber());
			payment.setTransactionDate(paymentDetails.getTransactionDate());
			payment.setModeOfPayment(paymentDetails.getModeOfPayment());
			payment.setPaymentStatus(paymentDetails.getPaymentStatus());
			return paymentRepository.save(payment);
		} else {
			return null;
		}
	}

	public void deletePayment(Long id) {
		paymentRepository.deleteById(id);
	}
}
