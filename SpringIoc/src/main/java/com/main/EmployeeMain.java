package com.main;

import java.util.Scanner;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Department;
import com.model.Employee;

public class EmployeeMain {

	

	public static void main(String[] args) {
	/*	Employee employee=new Employee();      //control of pojo class
		employee.setEmpNo(11);
		//release the memory=De reference
		employee=null;*/
		
		//container   1.bean factory    2.ApplicationContext
		
		ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("spring-core-config.xml");
		/*Employee obj =(Employee)applicationcontext.getBean("Emp");
		System.out.println(obj.getEmpNo());
		System.out.println(obj.getEmpName());*/
		Employee employee =(Employee)applicationcontext.getBean("employee");
		Department department =(Department)applicationcontext.getBean("department");
		/*department.setDepNo(123);
		department.setDepName("Development");*/
		System.out.println("dept no:"+department.getDepNo());
		System.out.println("dept name:"+department.getDepName());
	
		Scanner scannerObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter employee  no:");
		 int n = scannerObj.nextInt(); 
		 System.out.println(n);
		 System.out.println("name:"+department.getEmployee().getEmpNo()); 

		if(n==(department.getEmployee().getEmpNo())){
		System.out.println("name:"+department.getEmployee().getEmpName());
		}
		else{
			System.out.println("hi");
		}
		
		
		}
		
	
	
	}


