package com.paulina.productscategories.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.validation.BindingResult;

import com.paulina.productscategories.models.Category;
import com.paulina.productscategories.models.Product;
import com.paulina.productscategories.services.CategoryService;
import com.paulina.productscategories.services.ProductService;

@Controller
public class CategoryController {
	private final CategoryService categoryService;
	private final ProductService productService;

	public CategoryController(CategoryService categoryService, ProductService productService) {
		this.categoryService = categoryService;
		this.productService = productService;
	}
	
	@RequestMapping ("/categories/new")
	public String newCategory(@ModelAttribute("category") Category category) {
		return "categories/newCategory.jsp";
	}
	
	
	@PostMapping("/categories/new")
	public String newCategory(@Valid @ModelAttribute("category") Category category, BindingResult results) {
		if(results.hasErrors()) {
			return "categories/newCategory.jsp";
		}
		else { 
			categoryService.createCategory(category);
			return "redirect:/categories/new";
		}
	}

	@RequestMapping("categories/{id}")
	public String viewCategories(@PathVariable("id") Long id, Model model) {
		Category category=categoryService.findCategory(id);
		model.addAttribute("category", category);
		List<Product> products = productService.allProducts();
		model.addAttribute("products", products);
		return "categories/CategoryPage.jsp";
		
	}
	
	@RequestMapping("categoryProduct/{id}")
	public String addProduct(@PathVariable ("id") Long category_id, @RequestParam("products") Long id) {
		Product product=productService.findProduct(id);
		Category category=categoryService.findCategory(category_id);
		category.getProducts().add(product);
		categoryService.createCategory(category);
		return "redirect:/categories/{id}";
	}
	
		
}
