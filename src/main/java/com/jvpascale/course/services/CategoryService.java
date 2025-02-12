package com.jvpascale.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jvpascale.course.entities.Category;
import com.jvpascale.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository CategoryRepository;
	
	public List<Category> FindAll(){
		return CategoryRepository.findAll();
	}
	
	public Category findById(Long id) {
		return CategoryRepository.findById(id).get();
	}
	
}
