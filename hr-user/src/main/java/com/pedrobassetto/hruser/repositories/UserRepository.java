package com.pedrobassetto.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrobassetto.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
	

}
