package com.Application.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Application.Entity.User;

public interface UserRepository extends JpaRepository<User, Long>   {
	
	List<User> findByUserName(String userName);

}
