package com.paulina.productscategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.paulina.productscategories.models.Category;
import com.paulina.productscategories.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	private final CategoryRepository categoryRepository;

	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public List <Category>allCategories() {
		return categoryRepository.findAll();
	}
	
	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}

	public Category updateCategory(Category category) {
		return categoryRepository.save(category);
	}

	public Category findCategory(Long id) {
		Optional<Category> optionalCategory = categoryRepository.findById(id);
		if(optionalCategory.isPresent()) {
			return optionalCategory.get();
		}
		else {
			return null;
		}
	}

	public void deleteCategory (Long id) {
		categoryRepository.deleteById(id);
	}

	
	
}
