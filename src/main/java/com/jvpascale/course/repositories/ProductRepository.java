package com.jvpascale.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvpascale.course.entities.Category;
import com.jvpascale.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
