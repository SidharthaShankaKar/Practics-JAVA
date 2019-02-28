package com.Emp.clint.Day08;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.day08.Services.EmployeeServiceIEmply;
import com.employee.Day_08.Employee;

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
