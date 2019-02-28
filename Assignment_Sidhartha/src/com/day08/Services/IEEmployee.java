package com.day08.Services;

import java.util.Date;

import com.employee.Day_08.Employee;

public interface IEEmployee 
{
	public abstract void addEMployee(String empName,int empId,double empSal,String empDesignation,Date doj);
	public abstract Employee getEmployee();

}
