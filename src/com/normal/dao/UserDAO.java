package com.normal.dao;

import org.mybatis.spring.annotation.MapperScan;

import com.normal.model.User;

/**
 * userDAO接口
 * @author weiyong
 *
 */
@MapperScan
public interface UserDAO {
	
	/**
	 * 根据id获取用户
	 * @param uerId
	 * @return
	 */
	User getUserById(int uerId);
	
	/**
	 * 保存用户
	 * @param user
	 */
	void saveUser(User user);

}
