package com.omorales.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omorales.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

