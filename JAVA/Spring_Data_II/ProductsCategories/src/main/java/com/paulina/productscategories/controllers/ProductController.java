package com.paulina.productscategories.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.paulina.productscategories.models.Category;
import com.paulina.productscategories.models.Product;
import com.paulina.productscategories.services.CategoryService;
import com.paulina.productscategories.services.ProductService;

@Controller
public class ProductController {
	private final ProductService productService;
	private final CategoryService categoryService;
	
	public ProductController (CategoryService categoryService, ProductService productService) {
		this.categoryService = categoryService;
		this.productService = productService;
	}
	
	
	@RequestMapping ("/products/new")
	public String newProduct(@ModelAttribute("product") Product product) {
		return "products/newProduct.jsp";
	}
	

	@PostMapping("/products/new")
	public String newProduct(@Valid @ModelAttribute ("product") Product product, BindingResult results) {
		if(results.hasErrors()) {
			return "products/newProduct.jsp";
		}
		else { 
			productService.createProduct(product);
			return "redirect:/products/new";
		}
	}
	
	@RequestMapping("/products/{id}")
	public String viewProducts(@PathVariable("id") Long id, Model model) {
		Product product = productService.findProduct(id);
		model.addAttribute("product", product);
		List <Category> categories = categoryService.allCategories();
		model.addAttribute("categories", categories);
		return "products/ProductPage.jsp";
	}
	
    @RequestMapping("/productCategory/{id}")
		public String addCategory(@PathVariable("id") Long id, @RequestParam("categories") Long category_id) {
		Product product = productService.findProduct(id);
		Category category= categoryService.findCategory(category_id);
		product.getCategories().add(category);
		productService.createProduct(product);
		return "redirect:/products/{id}";
	}
}
