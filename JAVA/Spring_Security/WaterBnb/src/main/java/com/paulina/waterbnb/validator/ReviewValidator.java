package com.paulina.waterbnb.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.paulina.waterbnb.models.Review;

@Component
public class ReviewValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Review.class.equals(clazz);
	}
	
	@Override
	public void validate(Object object, Errors errors) {
	}
}

