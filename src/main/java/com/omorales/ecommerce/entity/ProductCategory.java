package com.omorales.ecommerce.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="product_category")
public class ProductCategory {
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="category_name")
	private String categoryName;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "category")
//	@JoinColumn(name = "product_id") //use to asign a name or create a id in another table
	private Set<Product> products;
	
	
}