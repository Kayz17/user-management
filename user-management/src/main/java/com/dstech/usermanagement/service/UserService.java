package com.dstech.usermanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dstech.usermanagement.model.User;
import com.dstech.usermanagement.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {

		Iterable<User> it = userRepository.findAll();

		List<User> users = new ArrayList<User>();
		it.forEach(e -> users.add(e));

		return users;
	}

	public Long count() {

		return userRepository.count();
	}

	public void deleteById(Long userId) {

		userRepository.deleteById(userId);
	}

	public void add(User user) {
		userRepository.save(user);
	}
}