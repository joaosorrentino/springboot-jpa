package com.groovetech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groovetech.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
