package com.normal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.normal.model.SMSInfo;
import com.normal.service.SMSInfoService;

/**
 * 短信信息控制器
 * @author wy
 *
 */
@Controller
public class SMSInfoController {
	
	@Autowired
	SMSInfoService smsInfoService;
	
	/*** 
     * 首页 返回至/page/home.jsp页面 
     * @return 
     */  
    @RequestMapping("/getSMSInfo")  
    public ModelAndView getSMSInfo(){  
        //创建模型跟视图，用于渲染页面。并且指定要返回的页面为home页面  
    	List<SMSInfo> smsInfos = smsInfoService.getSMSInfoList();
        ModelAndView mav = new ModelAndView("smsinfo");
        mav.addObject("smsInfos", smsInfos);
        mav.addObject("a", "b");
        return mav;  
    }
	
}
