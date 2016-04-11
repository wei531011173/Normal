package com.normal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author weiyong
 *
 */
@Controller
public class HomeController {
	
	/*** 
     * @return 
     */  
    @RequestMapping("/home")  
    public ModelAndView index(){  
        ModelAndView mav = new ModelAndView("home");  
        return mav;  
    }

    
}
