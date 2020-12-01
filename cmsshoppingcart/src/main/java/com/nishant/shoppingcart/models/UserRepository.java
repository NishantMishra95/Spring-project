package com.nishant.shoppingcart.models;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nishant.shoppingcart.models.data.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByUsername(String username);

}
