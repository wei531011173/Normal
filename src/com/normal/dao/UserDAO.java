package com.normal.dao;

import org.mybatis.spring.annotation.MapperScan;

import com.normal.model.User;

/**
 * userDAO�ӿ�
 * @author weiyong
 *
 */
@MapperScan
public interface UserDAO {
	
	/**
	 * ����id��ȡ�û�
	 * @param uerId
	 * @return
	 */
	User getUserById(int uerId);
	
	/**
	 * �����û�
	 * @param user
	 */
	void saveUser(User user);

}
