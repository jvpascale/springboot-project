package com.jvpascale.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvpascale.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
