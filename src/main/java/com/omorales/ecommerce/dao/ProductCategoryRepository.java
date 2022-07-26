package com.omorales.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.omorales.ecommerce.entity.ProductCategory;


@RepositoryRestResource(collectionResourceRel = "productCategory12", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
