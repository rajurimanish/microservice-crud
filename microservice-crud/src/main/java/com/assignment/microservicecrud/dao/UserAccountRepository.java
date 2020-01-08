package com.assignment.microservicecrud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.microservicecrud.entity.UserAccount;

public interface UserAccountRepository extends JpaRepository<UserAccount, Integer> {

}
