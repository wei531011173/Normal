package com.normal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.normal.model.User;
import com.normal.service.UserService;
import com.normal.util.LogUtil;
import com.normal.util.UserUtil;

@Controller
@RequestMapping("/page")  
public class UserController {
	
	@Autowired
	UserService userService;
	
	/*** 
     * @return 
     */  
    @RequestMapping("/index")  
    public ModelAndView index(){  
    	
    	User u = UserUtil.getUser();
    	LogUtil.logger.info("is a log");
        ModelAndView mav = new ModelAndView("index", "user", u);  
        return mav;  
    }

}
