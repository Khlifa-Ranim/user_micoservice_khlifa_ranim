package com.Ranim.demo.service;

import java.util.List;

import com.Ranim.demo.entites.Role;
import com.Ranim.demo.entites.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();

}
