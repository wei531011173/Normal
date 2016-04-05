package com.normal.model;

/**
 * 短信价格实体类
 * 
 * @author wy
 *
 */
public class SMSInfo {

	private int id;
	/** 显示位置 */
	private int posId;
	/** 短信条数 */
	private int smsCount;
	/** 描述 */
	private String detailInfo;
	/** 金额 */
	private int money;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPosId() {
		return posId;
	}

	public void setPosId(int posId) {
		this.posId = posId;
	}

	public int getSmsCount() {
		return smsCount;
	}

	public void setSmsCount(int smsCount) {
		this.smsCount = smsCount;
	}

	public String getDetailInfo() {
		return detailInfo;
	}

	public void setDetailInfo(String detailInfo) {
		this.detailInfo = detailInfo;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}
