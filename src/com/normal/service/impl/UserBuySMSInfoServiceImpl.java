package com.normal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.normal.dao.UserBuySMSInfoDAO;
import com.normal.service.UserBuySMSInfoService;

/**
 * 
 * @author weiyong
 *
 */
@Service("userBuySMSInfoService")
public class UserBuySMSInfoServiceImpl implements UserBuySMSInfoService{
	
	@Autowired
	UserBuySMSInfoDAO userBuySMSInfoDAO;
}
