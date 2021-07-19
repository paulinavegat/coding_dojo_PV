package com.paulina.productscategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.paulina.productscategories.models.Product;

public interface ProductRepository  extends CrudRepository<Product, Long> {

	List<Product> findAll();
}
