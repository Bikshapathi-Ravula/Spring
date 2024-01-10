package com.route.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.route.config.DataSourceContextHolder;
import com.route.dto.Users;
import com.route.enums.DataSourceType;
import com.route.repo.UsersRepo;

@Service
public class UsersService {

	@Autowired
	private UsersRepo usersRepo;

	@Transactional
	public Users save(Users users) {
		System.out.println("UsersService.save()");
		return usersRepo.save(users);
	}

	public Optional<Users> getById(Users users) {
		System.out.println("UsersService.getById()");

		DataSourceContextHolder.setDataSourceType(DataSourceType.READ);
		System.out.println("DataSource Type:" + DataSourceContextHolder.getDataSourceType());
		Optional<Users> users2 = usersRepo.findById(users.getId());
		if (users2.isPresent()) {
			System.out.println("if");
			return users2;
		} else {
			System.out.println("else");
			DataSourceContextHolder.reset();
			System.out.println("DataSource Type:" + DataSourceContextHolder.getDataSourceType());
			return usersRepo.findById(users.getId());
		}
	}

}
