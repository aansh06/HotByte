package com.hexa.service;

import com.stripe.exception.StripeException;
import com.hexa.model.Order;
import com.hexa.model.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
