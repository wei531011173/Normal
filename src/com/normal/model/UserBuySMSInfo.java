package com.normal.model;

/**
 * 用户购买记录实体类
 * 
 * @author wy
 *
 */
public class UserBuySMSInfo {

	private int id;
	/** 用户ID */
	private int userId;
	/** 档位信息 */
	private int smsId;
	/** 是否购买成功 */
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
