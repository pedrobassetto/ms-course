package com.pedrobassetto.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.pedrobassetto.hrpayroll.entities.Payment;
import com.pedrobassetto.hrpayroll.entities.Worker;
import com.pedrobassetto.hrpayroll.feignclients.WorkerFeignClient;

@Service	
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(Long workerId, int days) {
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
