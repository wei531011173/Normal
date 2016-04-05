package com.normal.service;

import java.util.List;

import com.normal.model.UserBuySMSInfo;

/**
 * ÓÃ»§¹ºÂò¼ÇÂ¼
 * 
 * @author weiyong
 *
 */
public interface UserBuySMSInfoService {

	List<UserBuySMSInfo> getSMSInfoByUserId(int userId);

	void saveUserBuySMSInfo(UserBuySMSInfo info);

	void updateUserBuySMSInfoById(UserBuySMSInfo info);

}
