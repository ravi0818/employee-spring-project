package com.wipro.employee;

public class Employee {
	private int id;
	private String name;
	private int age;
	private String job;
	private String phone;
	private String address;
	public Employee() {
	}
	public Employee(int id, String name, int age, String job, String phone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.job = job;
		this.phone = phone;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", job=" + job + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	
	
}
