package com.pedrobassetto.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.pedrobassetto.hrpayroll.entities.Payment;

@Service	
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("Pedro", 1000.00, days);
	}

}
