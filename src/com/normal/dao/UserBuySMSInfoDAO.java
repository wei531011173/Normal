package com.normal.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.normal.model.UserBuySMSInfo;

/**
 * �û������¼DAO
 * @author wy
 *
 */
@MapperScan
public interface UserBuySMSInfoDAO {
	
	/**
	 * �����û�id��ȡ�û��ĳ�ֵ��Ϣ
	 * @param userId
	 * @return
	 */
	List<UserBuySMSInfo> getSMSInfoByUserId(int userId);
	
	/**
	 * �����û��ĳ�ֵ��Ϣ
	 * @param info
	 */
	void saveUserBuySMSInfo(UserBuySMSInfo info);
	
	/**
	 * �����û��ĳ�ֵ��Ϣ
	 * @param id
	 */
	void updateUserBuySMSInfoById(UserBuySMSInfo info);

}
