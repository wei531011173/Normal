package com.normal.model;

/**
 * �û�ʵ����
 * 
 * @author weiyong
 *
 */
public class User {

	private int id;
	/** �̵��ʶ */
	private int shopId;
	/** �������� */
	private int smsCount;
	/** ����ʱ�� */
	private int buyTime;
	/** �������� */
	private int dayCount;

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

}
