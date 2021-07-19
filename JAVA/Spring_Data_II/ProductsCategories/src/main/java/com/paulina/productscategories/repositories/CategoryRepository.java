package com.paulina.productscategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.paulina.productscategories.models.Category;


public interface CategoryRepository extends CrudRepository<Category, Long> {
	List<Category> findAll();
}
