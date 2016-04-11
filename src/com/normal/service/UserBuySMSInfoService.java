package com.normal.service;

import java.util.List;

import com.normal.model.UserBuySMSInfo;

/**
 * 用户购买信息
 * 
 * @author weiyong
 *
 */
public interface UserBuySMSInfoService {

	List<UserBuySMSInfo> getSMSInfoByUserId(int userId);

	void saveUserBuySMSInfo(UserBuySMSInfo info);

	void updateUserBuySMSInfoById(UserBuySMSInfo info);

}
