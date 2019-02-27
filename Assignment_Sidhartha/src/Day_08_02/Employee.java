package Day_08_02;

import java.util.Date;
/**
 * @author Sidhartha
 *
 */
public class Employee 
{
	private String empName;
	private int empId;
	private double empSal;
	private String empDesignation;
	private Date doj;
	public Employee(String empName, double empSal, String empDesignation, Date doj) {
		super();
		this.empName = empName;
		this.empSal = empSal;
		this.empDesignation = empDesignation;
		this.doj = doj;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
	

}
