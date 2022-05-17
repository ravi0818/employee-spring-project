package com.wipro.employee;

import java.sql.SQLException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@GetMapping
	public String main() {
		EmployeeDAO.dbCon();
		return "Welcome";
	}
	
	@GetMapping("/emp")
	public String getEmployee() throws SQLException {
		String res = EmployeeService.getAllEmployee();
		return res;
	}
	
	@PostMapping("/add")
	public void addEmployee(@RequestBody Employee emp) throws SQLException {
		EmployeeService.addEmployee(emp);
	}
	
	@PostMapping("/update")
	public void updateEmployee(@RequestBody Employee emp) throws SQLException {
		EmployeeService.updateEmployee(emp);
	}
	
	@PostMapping("/delete")
	public void deleteEmployee(@RequestBody Employee emp) throws SQLException {
		EmployeeService.deleteEmployee(emp);
	}
}
