package com.assignment.microservicecrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.microservicecrud.dao.UserAccountRepository;
import com.assignment.microservicecrud.dao.UserRepository;
import com.assignment.microservicecrud.entity.User;
import com.assignment.microservicecrud.entity.UserAccount;

@RestController
public class MainController {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserAccountRepository userAccountRepository;

	@PostMapping(value = "/addUser")
	public String addUser(@RequestBody User user) {
		try {
			userRepository.save(user);
			return "User Added Successfully";
		} catch (Exception ex) {
			ex.printStackTrace();
			return "Some error occured while adding user";
		}

	}

	@GetMapping(value = "/getUserDetails/{id}")
	public User getUserDetails(@Param(value = "id") int id) {
		return userRepository.getOne(id);
	}

	@PutMapping(value = "/updateUser")
	public String updateUserDetails(@RequestBody User user) {
		try {
			userRepository.save(user);
			return "User Updated Successfully";
		} catch (Exception ex) {
			ex.printStackTrace();
			return "Some error occured while updating user";
		}
	}

	@DeleteMapping(value = "/deleteUser/{id}")
	public String deleteUser(@Param(value = "id") int id) {
		try {
			userRepository.deleteById(id);
			return "User Deleted Successfully";
		} catch (Exception ex) {
			ex.printStackTrace();
			return "User Could not be deleted";
		}

	}
	
	
	@PostMapping(value = "/addUserAccount")
	public String addUserAccount(@RequestBody UserAccount user) {
		try {
			userAccountRepository.save(user);
			return "User Added Successfully";
		} catch (Exception ex) {
			ex.printStackTrace();
			return "Some error occured while adding user account";
		}

	}

	@GetMapping(value = "/getUserAccountDetails/{id}")
	public UserAccount getUserAccountDetails(@Param(value = "id") int id) {
		return userAccountRepository.getOne(id);
	}

	@PutMapping(value = "/updateUserAccount")
	public String updateUserDetails(@RequestBody UserAccount user) {
		try {
			userAccountRepository.save(user);
			return "User Updated Successfully";
		} catch (Exception ex) {
			ex.printStackTrace();
			return "Some error occured while updating user";
		}
	}

	@DeleteMapping(value = "/deleteUserAccount/{id}")
	public String deleteUserAccount(@Param(value = "id") int id) {
		try {
			userAccountRepository.deleteById(id);
			return "User Deleted Successfully";
		} catch (Exception ex) {
			ex.printStackTrace();
			return "User Could not be deleted";
		}

	}
}
