package com.normal.model;

/**
 * �û������¼ʵ����
 * 
 * @author wy
 *
 */
public class UserBuySMSInfo {

	private int id;
	/** �û�ID */
	private int userId;
	/** ��λ��Ϣ */
	private int smsId;
	/** �Ƿ���ɹ� */
	private int isSuccess;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getSmsId() {
		return smsId;
	}

	public void setSmsId(int smsId) {
		this.smsId = smsId;
	}

	public int getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(int isSuccess) {
		this.isSuccess = isSuccess;
	}

}
