package com.normal.model;

/**
 * 用户购买短信记录
 * 
 * @author wy
 *
 */
public class UserBuySMSInfo {

	private int id;
	/** 用户id */
	private int userId;
	/** 短信id */
	private int smsId;
	/** 是否成功 */
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
