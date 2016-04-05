package com.normal.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.normal.model.UserBuySMSInfo;

/**
 * 用户购买记录DAO
 * @author wy
 *
 */
@MapperScan
public interface UserBuySMSInfoDAO {
	
	/**
	 * 根据用户id获取用户的充值信息
	 * @param userId
	 * @return
	 */
	List<UserBuySMSInfo> getSMSInfoByUserId(int userId);
	
	/**
	 * 保存用户的充值信息
	 * @param info
	 */
	void saveUserBuySMSInfo(UserBuySMSInfo info);
	
	/**
	 * 更新用户的充值信息
	 * @param id
	 */
	void updateUserBuySMSInfoById(UserBuySMSInfo info);

}
