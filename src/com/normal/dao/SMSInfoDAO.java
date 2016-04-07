package com.normal.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.normal.model.SMSInfo;

/**
 * 可充值短信信息DAO
 * @author wy
 *
 */
@MapperScan
public interface SMSInfoDAO {
	
	/**
	 * 根据可充值短信id获取内容
	 * @param userId
	 * @return
	 */
	SMSInfo getSMSInfoById(int id);
	
	/**
	 * 获取所有可充值短信信息
	 * @return
	 */
	List<SMSInfo> getSMSInfoList();

}
