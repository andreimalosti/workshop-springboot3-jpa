package com.projetoandreijava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoandreijava.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
