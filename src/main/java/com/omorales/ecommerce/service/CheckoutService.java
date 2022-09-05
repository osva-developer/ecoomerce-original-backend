package com.omorales.ecommerce.service;

import com.omorales.ecommerce.dto.PaymentInfo;
import com.omorales.ecommerce.dto.Purchase;
import com.omorales.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
