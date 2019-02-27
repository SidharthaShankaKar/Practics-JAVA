package Services;

import java.util.Date;

import Day_08_02.Employee;

public class EmployeeServiceIEmply implements IEEmployee
{
	static Employee emp= null;

	public void addEMployee(String empName, int empId, double empSal, String empDesignation, Date doj) {
		emp=new Employee(empName, empSal, empDesignation, doj);
		
	}

	public Employee getEmployee() {
		// TODO Auto-generated method stub
		return emp;
	}


	
	

}
