package com.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.dto.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

	Optional<Users> findByUserName(String userName);
}
