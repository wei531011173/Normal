package com.normal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.normal.dao.UserDAO;
import com.normal.model.User;
import com.normal.service.UserService;

/**
 * 
 * @author weiyong
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDAO userDAO;

	@Override
	public User getUserById(int uerId) {
		return userDAO.getUserById(uerId);
	}

	@Override
	public void save(User user) {
		userDAO.save(user);
	}

}
