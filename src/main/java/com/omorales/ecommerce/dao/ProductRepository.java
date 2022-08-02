package com.omorales.ecommerce.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.omorales.ecommerce.entity.Product;



@CrossOrigin
public interface ProductRepository extends JpaRepository<Product, Long> {
//	Page<Product> findByCategoryId(@RequestParam("id") Long id,Pageable page);
	Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);
}

