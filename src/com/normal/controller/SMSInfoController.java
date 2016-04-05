package com.normal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.normal.model.SMSInfo;
import com.normal.service.SMSInfoService;

/**
 * ������Ϣ������
 * @author wy
 *
 */
@Controller
public class SMSInfoController {
	
	@Autowired
	SMSInfoService smsInfoService;
	
	/*** 
     * ��ҳ ������/page/home.jspҳ�� 
     * @return 
     */  
    @RequestMapping("/getSMSInfo")  
    public ModelAndView getSMSInfo(){  
        //����ģ�͸���ͼ��������Ⱦҳ�档����ָ��Ҫ���ص�ҳ��Ϊhomeҳ��  
    	List<SMSInfo> smsInfos = smsInfoService.getSMSInfoList();
        ModelAndView mav = new ModelAndView("smsinfo");
        mav.addObject("smsInfos", smsInfos);
        mav.addObject("a", "b");
        return mav;  
    }
	
}
