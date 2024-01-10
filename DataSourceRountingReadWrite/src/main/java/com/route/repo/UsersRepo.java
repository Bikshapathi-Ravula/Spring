package com.route.repo;

import org.springframework.data.repository.CrudRepository;

import com.route.dto.Users;

public interface UsersRepo extends CrudRepository<Users, Integer> {

}
