package com.normal.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.normal.model.UserBuySMSInfo;

/**
 * 用户购买短信
 * @author wy
 *
 */
@MapperScan
public interface UserBuySMSInfoDAO {
	
	/**
	 * 根据用户获取信息
	 * @param userId
	 * @return
	 */
	List<UserBuySMSInfo> getSMSInfoByUserId(int userId);
	
	/**
	 * 保存
	 * @param info
	 */
	void saveUserBuySMSInfo(UserBuySMSInfo info);
	
	/**
	 * 更新
	 * @param id
	 */
	void updateUserBuySMSInfoById(UserBuySMSInfo info);

}
