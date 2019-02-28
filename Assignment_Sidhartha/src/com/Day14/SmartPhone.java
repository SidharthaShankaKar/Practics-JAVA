package com.Day14;

import java.util.Date;

public class SmartPhone extends mobile_Class
{

private String extraFeature;
public SmartPhone() {
	// TODO Auto-generated constructor stub
}
public SmartPhone(int mobileId, String mobileName, String mobileCoName, String mobilePrice, Date manfDate) {
	super(mobileId, mobileName, mobileCoName, mobilePrice, manfDate);
	
}
public SmartPhone(String extraFeature) {
	this.extraFeature = extraFeature;
}

@Override
public void print() {
	super.print();
}
@Override
public String toString() 
{
	super.toString();
	return "SmartPhone [extraFeature=" + extraFeature + "]";
}


}
