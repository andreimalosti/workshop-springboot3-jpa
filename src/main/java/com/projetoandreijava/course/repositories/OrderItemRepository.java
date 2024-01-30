package com.projetoandreijava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoandreijava.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
