package com.Day10;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import Day_08_02.Employee;

public class EmployeeServiceIEmply implements IEEmployee
{
	Map<String, Integer> empmap= new HashMap<String, Integer>();
	Employee emp=null;

	@Override
	public void updateEmployee(Employee emp) 
	{
		emp.setEmpName(emp.getEmpName());
		emp.setEmpSal(30000000);
		System.out.println(emp);
		
	}

	@Override
	public boolean deleteemployee(int empId) {
		if(empmap.containsKey(empId)) {
			empmap.remove(empId);
			return true;
		} else
			return false;
	}
	@Override
	public void searchemployee(int empId1) {
		Set<Integer> empId1 = empmap.keySet();
		boolean isEmpFound = false;

		for(int id : empId1) {
			if(id  == empId) {
				isEmpFound = true;
				break;
				}
		}
	}

	@Override
	public void addEMployee(Employee emp) {
		// TODO Auto-generated method stub
		empmap.put(emp.getEmpId(),emp);
		System.out.println("The Employee " + emp + " is added successfully");
		}
if(isEmpFound) {
	System.out.println("The Employee is found with key:"+empId);
}
else {
	System.out.println("The Employee is not found with key:"+empId); 
}
}}
