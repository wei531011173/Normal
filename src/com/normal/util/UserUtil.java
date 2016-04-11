package com.normal.util;

import com.normal.model.User;

/**
 * 用户工具类
 * @author wy
 *
 */
public class UserUtil {
	
	private static ThreadLocal<User> USERLOCAL = new ThreadLocal<User>();
	
	public static void setUser(User user) {
		USERLOCAL.set(user);
	}
	
	public static User getUser() {
		 return USERLOCAL.get();
	}
	
	

}
