package com.omorales.ecommerce.dto;


import java.util.Set;

import com.omorales.ecommerce.entity.Address;
import com.omorales.ecommerce.entity.Customer;
import com.omorales.ecommerce.entity.Order;
import com.omorales.ecommerce.entity.OrderItem;

import lombok.Data;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
