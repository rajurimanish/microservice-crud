package com.assignment.microservicecrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.microservicecrud.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
