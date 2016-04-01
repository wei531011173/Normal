package com.normal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.normal.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	/*** 
     * ��ҳ ������/page/home.jspҳ�� 
     * @return 
     */  
    @RequestMapping("/user")  
    public ModelAndView index(){  
        //����ģ�͸���ͼ��������Ⱦҳ�档����ָ��Ҫ���ص�ҳ��Ϊhomeҳ��  
    	userService.getUserById(1);
        ModelAndView mav = new ModelAndView("home");  
        return mav;  
    }
	
	

}
