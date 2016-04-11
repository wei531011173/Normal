package com.normal.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.normal.model.SMSInfo;
import com.normal.model.UserBuySMSInfo;
import com.normal.service.SMSInfoService;
import com.normal.service.UserBuySMSInfoService;

/**
 * 充值额度
 * @author wy
 *
 */
@Controller
public class SMSInfoController {
	
	@Autowired
	SMSInfoService smsInfoService;
	
	@Autowired
	UserBuySMSInfoService userBuySMSInfoService;
	
	/*** 
     * @return 
     */  
    @RequestMapping("/getSMSInfo")  
    public ModelAndView getSMSInfo(){  
    	List<SMSInfo> smsInfos = smsInfoService.getSMSInfoList();
        ModelAndView mav = new ModelAndView("smsinfo");
        mav.addObject("smsInfos", smsInfos);
        mav.addObject("a", "b");
        return mav;  
    }
    
    @RequestMapping("/chargeSMS")  
    public ModelAndView chargeSMS(HttpServletRequest request){
    	
    	SMSInfo smsInfo = smsInfoService.getSMSInfoById(1);
    	
    	UserBuySMSInfo userBuySMSInfo = new UserBuySMSInfo();
    	userBuySMSInfo.setUserId(1);
    	userBuySMSInfo.setSmsId(smsInfo.getId());
    	userBuySMSInfo.setIsSuccess(0);
    	
    	userBuySMSInfoService.saveUserBuySMSInfo(userBuySMSInfo);
    	
        ModelAndView mav = new ModelAndView("smsinfo");
        return mav;  
    }
    
    
	
}
