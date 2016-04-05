package com.normal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
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
	
	@Autowired
	TaskExecutor taskExecutor;

	@Override
	public User getUserById(int uerId) {
		return userDAO.getUserById(uerId);
	}

	@Override
	public void save(User user) {
		
		taskExecutor.execute(new Runnable() {
			
			@Override
			public void run() {
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("finish");
			}
		});
		
	//	userDAO.save(user);
		System.out.println("return");
	}

}
