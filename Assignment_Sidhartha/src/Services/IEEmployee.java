package Services;

import java.util.Date;

import Day_08_02.Employee;

public interface IEEmployee 
{
	public abstract void addEMployee(String empName,int empId,double empSal,String empDesignation,Date doj);
	public abstract Employee getEmployee();

}
