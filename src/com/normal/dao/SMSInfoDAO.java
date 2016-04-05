package com.normal.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.normal.model.SMSInfo;

/**
 * �ɳ�ֵ������ϢDAO
 * @author wy
 *
 */
@MapperScan
public interface SMSInfoDAO {
	
	/**
	 * ���ݿɳ�ֵ����id��ȡ����
	 * @param userId
	 * @return
	 */
	SMSInfo getSMSInfoById(int id);
	
	/**
	 * ��ȡ���пɳ�ֵ������Ϣ
	 * @return
	 */
	List<SMSInfo> getSMSInfoList();

}
