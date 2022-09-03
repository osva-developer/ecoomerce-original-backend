package com.omorales.ecommerce.service;

import com.omorales.ecommerce.dto.Purchase;
import com.omorales.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
