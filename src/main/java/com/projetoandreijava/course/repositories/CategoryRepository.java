package com.projetoandreijava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoandreijava.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
