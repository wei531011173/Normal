package com.normal.service;

import com.normal.model.User;

/**
 * 
 * @author weiyong
 *
 */
public interface UserService {
	
	User getUserById(int id);
	
	void save(User user);

}
