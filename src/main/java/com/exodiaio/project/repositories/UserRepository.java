package com.exodiaio.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exodiaio.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
