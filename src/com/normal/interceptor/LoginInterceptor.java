package com.normal.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.normal.model.User;
import com.normal.service.UserService;
import com.normal.util.UserUtil;

/**
 * 登陆拦截器
 * @author weiyong
 *
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {
	
	@Autowired
	UserService userService;
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		if(UserUtil.getUser() == null) {
			User user = userService.getUserById(1);
			UserUtil.setUser(user);
		}
		return true;
	}

}
