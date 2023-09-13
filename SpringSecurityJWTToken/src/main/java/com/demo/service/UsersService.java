package com.demo.service;

import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.dto.Users;
import com.demo.repo.UserRepository;

@Service
public class UsersService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public Users saveUser(@RequestBody Users users) {

		users.setPassword(passwordEncoder.encode(users.getPassword()));

		return userRepository.save(users);
	}

	public Optional<Users> grtUserByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<Users> existUser = this.grtUserByUserName(username);
		if (existUser.isEmpty()) {
			throw new UsernameNotFoundException("User Not Found");
		}
		Users user = existUser.get();
		return new org.springframework.security.core.userdetails.User(username, user.getPassword(),
				user.getRole().stream().map(role -> new SimpleGrantedAuthority(role)).collect(Collectors.toList()));
	}

}
