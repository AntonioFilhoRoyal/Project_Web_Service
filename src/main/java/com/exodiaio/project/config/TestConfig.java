package com.exodiaio.project.config;

import org.springframework.beans.factory.annotation.Autowired;

import com.exodiaio.project.repositories.UserRepository;

public class TestConfig {
	
	@Autowired
	private UserRepository userRepository;
	
	
}
