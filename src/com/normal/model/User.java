package com.normal.model;

/**
 * 用户实体类
 * 
 * @author weiyong
 *
 */
public class User {

	private int id;
	/** 商店标识 */
	private int shopId;
	/** 短信数量 */
	private int smsCount;
	/** 订购时间 */
	private int buyTime;
	/** 订购天数 */
	private int dayCount;
	/** 用户名*/
	private String userName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getShopId() {
		return shopId;
	}

	public void setShopId(int shopId) {
		this.shopId = shopId;
	}

	public int getSmsCount() {
		return smsCount;
	}

	public void setSmsCount(int smsCount) {
		this.smsCount = smsCount;
	}

	public int getBuyTime() {
		return buyTime;
	}

	public void setBuyTime(int buyTime) {
		this.buyTime = buyTime;
	}

	public int getDayCount() {
		return dayCount;
	}

	public void setDayCount(int dayCount) {
		this.dayCount = dayCount;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
