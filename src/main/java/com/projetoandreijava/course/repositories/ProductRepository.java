package com.projetoandreijava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoandreijava.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
