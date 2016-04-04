package com.normal.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.normal.model.SMSInfo;

/**
 * ������ϢDAO
 * @author wy
 *
 */
@MapperScan
public interface SMSInfoDAO {
	
	SMSInfo getSMSInfoById(int uerId);
	
	List<SMSInfo> getSMSInfoList();

}
