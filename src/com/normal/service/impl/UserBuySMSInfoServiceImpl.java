package com.normal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.normal.dao.UserBuySMSInfoDAO;
import com.normal.model.UserBuySMSInfo;
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

	@Override
	public List<UserBuySMSInfo> getSMSInfoByUserId(int userId) {
		return userBuySMSInfoDAO.getSMSInfoByUserId(userId);
	}

	@Override
	public void saveUserBuySMSInfo(UserBuySMSInfo info) {
		
		userBuySMSInfoDAO.saveUserBuySMSInfo(info);
		
	}
	@Override
	public void updateUserBuySMSInfoById(UserBuySMSInfo info) {
		userBuySMSInfoDAO.updateUserBuySMSInfoById(info);
	}
	
	
}
