package com.normal.service;

import java.util.List;

import com.normal.model.SMSInfo;

/**
 * @author weiyong
 *
 */
public interface SMSInfoService {
	
	SMSInfo getSMSInfoById(int id);
	
	List<SMSInfo> getSMSInfoList();
	
	

}
