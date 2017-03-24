package com.spring.integration.router;

import com.spring.integration.payment.CreditCardPayment;
import com.spring.integration.payment.Invoice;
import com.spring.integration.payment.PaymentSettlement;
import com.spring.integration.payment.PaypalPayment;

public class PaymentSettlementRouter {

	public String routePaymentSettlement(PaymentSettlement paymentSettlement) {
		String destinationChannel = null;
		if (paymentSettlement instanceof CreditCardPayment)
			destinationChannel = "credit-card-payments";
		if (paymentSettlement instanceof Invoice)
			destinationChannel = "invoices";
		if (paymentSettlement instanceof PaypalPayment)
			destinationChannel = "paypal-payments";
		return destinationChannel;
	}
}
