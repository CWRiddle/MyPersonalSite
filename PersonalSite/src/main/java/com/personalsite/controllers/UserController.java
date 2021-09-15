package com.personalsite.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personalsite.entities.User;
import com.personalsite.repositories.UserRepository;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	UserRepository uRepo;

	@GetMapping("ping")
	private String ping() {
		return "pong";
	}
	
	@GetMapping("index")
	private List<User> index(){
		return uRepo.findAll();
	}
	
}
