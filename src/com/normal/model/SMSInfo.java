package com.normal.model;

/**
 * ���ż۸�ʵ����
 * 
 * @author wy
 *
 */
public class SMSInfo {

	private int id;
	/** ��ʾλ�� */
	private int posId;
	/** �������� */
	private int smsCount;
	/** ���� */
	private String detailInfo;
	/** ��� */
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
