package com.model;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
public class Employee {
	private int empNo;
	private String empName;
	private float empSalary;
	
	public Employee() {
		super();
		
	}
	public Employee(int empNo, String empName, float empSalary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public int getEmpNo() {
		return empNo;
	}@Value("3")
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}@Value("sharmila")
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	

}
