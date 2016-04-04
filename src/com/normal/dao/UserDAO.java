package com.normal.dao;

import org.mybatis.spring.annotation.MapperScan;

import com.normal.model.User;

/**
 * userDAO½Ó¿Ú
 * @author weiyong
 *
 */
@MapperScan
public interface UserDAO {
	
	User getUserById(int uerId);
	
	void save(User user);

}
