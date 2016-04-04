package com.normal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.normal.dao.SMSInfoDAO;
import com.normal.model.SMSInfo;
import com.normal.service.SMSInfoService;

/**
 * 
 * @author weiyong
 *
 */
@Service("smsInfoService")
public class SMSInfoServiceImpl implements SMSInfoService{
	
	@Autowired
	SMSInfoDAO smsInfoDAO;

	@Override
	public SMSInfo getSMSInfoById(int uerId) {
		return smsInfoDAO.getSMSInfoById(uerId);
	}

	@Override
	public List<SMSInfo> getSMSInfoList() {
		return smsInfoDAO.getSMSInfoList();
	}
	
	

	
	
	

}
