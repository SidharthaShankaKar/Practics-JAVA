package com.Emp.clint;

import java.awt.DisplayMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Day_08_02.Employee;
import Services.EmployeeServiceIEmply;

public class EmployeeClint 
{
public static void main(String[] args) throws Exception
{
	EmployeeServiceIEmply emp1= new EmployeeServiceIEmply();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter The Detail Of emplyee");
	
	System.out.println("Enter EmplyeeName");
	String empName=sc.next();
	System.out.println("Enter EmplyeeSalary");
	double empSal=sc.nextDouble();
	System.out.println("Enter EmplyeeID");
	int empId=sc.nextInt();
	System.out.println("Enter the Employee Designation");
	String empDesignation=sc.next();
	System.out.println("Enter Employee Joining Date in the folpwing format"
			+ " dd-mm-yyyy");
	Date doj = new SimpleDateFormat("dd-MM-yyyy").parse(sc.next());
	sc.close();

	emp1.addEMployee(empName,empId, empSal,empDesignation,doj);
	Employee emp=emp1.getEmployee();
	displayEmployeeDetails(emp);
}

private static void displayEmployeeDetails(Employee emp) 
{
	System.out.println(" \n Employee Id::" + emp.getEmpId()
	+" \n Employee Name::" + emp.getEmpName()	+ " \n Employee Salary::" + emp.getEmpSal() + 
	 " \n Employee Description::" + emp.getEmpDesignation()	+ " \n Employee Date Of Joining" + emp.getDoj());
	
}
}
