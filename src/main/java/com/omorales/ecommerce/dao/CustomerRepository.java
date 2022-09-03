package com.omorales.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omorales.ecommerce.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
