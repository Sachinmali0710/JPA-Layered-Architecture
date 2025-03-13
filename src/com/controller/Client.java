package com.controller;

import com.model.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

public class Client {
	public static void main(String[] args) {
		
		EmployeeService service = new EmployeeServiceImpl();
		
		Employee emp = new Employee(101, "shree", 200000, "MAHA");
//		inserting data in the database 
//		service.addEmployee(emp);
		
//		Updating data of the database 
		emp.setEmpsal(500000);
		emp.setEmpadd("Mumbai");
		service.updateEmployee(emp);
		
//		fetching data from the database
		Employee emp1 = service.findByEmployeeId(101);
		
//		System.out.println(emp1);
		
//		deleting data 
//		service.deleteEmployee(emp1);
	}
}
