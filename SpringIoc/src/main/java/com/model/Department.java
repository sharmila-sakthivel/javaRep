package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
	private int depNo;
	private String depName;
	 @Autowired
	private Employee employee;
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Department() {
		super();
		
	}//constructor injection
	public Department(@Value("1") int depNo,@Value("Training") String depName) {
		super();
		this.depNo = depNo;
		this.depName = depName;
	}
	
	public int getDepNo() {
		return depNo;
	}@Value("1")
	
	public void setDepNo(int depNo) {
		this.depNo = depNo;
	}
	public String getDepName() {
		return depName;
	}@Value("Training")//setter injection
	public void setDepName(String depName) {
		this.depName = depName;
	}
	

}
