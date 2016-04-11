package com.normal.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.normal.model.SMSInfo;

/**
 * @author wy
 *
 */
@MapperScan
public interface SMSInfoDAO {
	
	/**
	 * @param userId
	 * @return
	 */
	SMSInfo getSMSInfoById(int id);
	
	/**
	 * @return
	 */
	List<SMSInfo> getSMSInfoList();

}
