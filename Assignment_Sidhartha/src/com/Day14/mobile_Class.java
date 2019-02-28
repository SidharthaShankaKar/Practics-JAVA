package com.Day14;

import java.util.Date;

public class mobile_Class 
{
	private int mobileId;
	private String mobileName;
	private String mobileCoName;
	private String mobilePrice;
	private Date manfDate;
	
	public mobile_Class() {
		// TODO Auto-generated constructor stub
	}

	public mobile_Class(int mobileId, String mobileName, String mobileCoName, String mobilePrice, Date manfDate) {
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.mobileCoName = mobileCoName;
		this.mobilePrice = mobilePrice;
		this.manfDate = manfDate;
	}

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public String getMobileCoName() {
		return mobileCoName;
	}

	public void setMobileCoName(String mobileCoName) {
		this.mobileCoName = mobileCoName;
	}

	public String getMobilePrice() {
		return mobilePrice;
	}

	public void setMobilePrice(String mobilePrice) {
		this.mobilePrice = mobilePrice;
	}

	public Date getManfDate() {
		return manfDate;
	}

	public void setManfDate(Date manfDate) {
		this.manfDate = manfDate;
	}
	public void print() {
		System.out.println("\n Mobile Id:" + mobileId + " \n Mobile Name:" + mobileName +
				"\n Mobile Company Name:" + mobileCoName + "\n Mobile Price:" + mobilePrice +
				"\n Mobile Manufacture Date:" + manfDate);
	}
	@Override
	public String toString() {
		return "mobile_Class [mobileId=" + mobileId + ", mobileName=" + mobileName + ", mobileCoName=" + mobileCoName
				+ ", mobilePrice=" + mobilePrice + ", manfDate=" + manfDate + "]";
	}

}
