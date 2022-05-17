package com.wipro.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeDAO {
	public static Connection dbCon() {
		String url="jdbc:mysql://localhost:3306/dba";
		String username="root";
		String password="root";
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url,username,password);
			System.out.println("Connection Successful!");
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		return conn;
	}
	
	public static ArrayList<Employee> allEmployee() throws SQLException {
		Connection conn = dbCon();
		
		Statement stmt = conn.createStatement();

		String sql = "select * from employee";
		
		ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
		try {
			ResultSet rs = stmt.executeQuery(sql);

			while(rs.next()) {
				Employee emp = new Employee();
				
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setAge(rs.getInt(3));
				emp.setJob(rs.getString(4));
				emp.setPhone(rs.getString(5));
				emp.setAddress(rs.getString(6));
				
				EmployeeList.add(emp);
				
			}
			System.out.println("Done allEmployee()");
		}
		catch(Exception e) {
			System.out.println("Failed allEmployee() "+e);
		}
		return EmployeeList;
	}
	public static void add(Employee emp) throws SQLException {
		Connection conn = dbCon();
		
		Statement stmt = conn.createStatement();

		String sql = "insert into employee values("
					+emp.getId()+",'"+emp.getName()+"',"
					+emp.getAge()+",'"+emp.getJob()+"','"
					+emp.getPhone()+"','"+emp.getAddress()+"')";
		
		try {
			stmt.execute(sql);
			System.out.println("Done add()");
		}
		catch(Exception e) {
			System.out.println("Failed add() "+e);
		}
	}
	public static void updateById(Employee emp) throws SQLException {
		Connection conn = dbCon();
		
		Statement stmt = conn.createStatement();
		
		String sql = "update employee set "
				+"name='"+emp.getName()+"',"
				+"age="+emp.getAge()+","
				+"job='"+emp.getJob()+"',"
				+"phone='"+emp.getPhone()+"',"
				+"address='"+emp.getAddress()+"'"
				+" where id="+emp.getId()+";";
		
		try {
			stmt.execute(sql);
			System.out.println("Done update()");
		}
		catch(Exception e) {
			System.out.println("Failed update() "+e);
		}
	}
	
	public static void deleteById(Employee emp) throws SQLException {
		Connection conn = dbCon();
		
		Statement stmt = conn.createStatement();

		String sql = "delete from employee where id="+emp.getId();
		
		try {
			stmt.execute(sql);
			System.out.println("Done delete()");
		}
		catch(Exception e) {
			System.out.println("Failed delete() "+e);
		}
	}
}
