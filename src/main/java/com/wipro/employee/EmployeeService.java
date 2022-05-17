package com.wipro.employee;

import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeService {
	public static String getAllEmployee() throws SQLException {
		ArrayList<Employee> EmployeeList = null;
		EmployeeList = EmployeeDAO.allEmployee();
		String res = "";
		for(int i=0;i<EmployeeList.size();i++) {
			res += "<p>" + EmployeeList.get(i).toString() + "</p>";
		}
		return res;
	}
	public static void addEmployee(Employee emp) throws SQLException {
		EmployeeDAO.add(emp);
	}
	
	public static void updateEmployee(Employee emp) throws SQLException {
		EmployeeDAO.updateById(emp);
		
	}
	
	
	public static void deleteEmployee(Employee emp) throws SQLException {
		EmployeeDAO.deleteById(emp);
		
	}
}
