package com.Day10;

import java.util.Date;

import com.employee.Day_08.Employee;

public interface IEEmployee 
{
	public abstract void addEMployee(Employee emp);
	public abstract void updateEmployee(Employee emp);
	public abstract boolean deleteemployee(int empId);
	public abstract void searchemployee(int empId);
	

}
