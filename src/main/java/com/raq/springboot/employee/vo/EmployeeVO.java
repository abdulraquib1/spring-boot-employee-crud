package com.raq.springboot.employee.vo;

public class EmployeeVO {
	
	
	
	private int id;
	private String fName;
	private String lName;
	private int age;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private double salary;
	
	
	
	
	public EmployeeVO(int id, String fName, String lName, int age, String addressLine1, String addressLine2,
			String city, double salary) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.salary = salary;
	}
	
	public EmployeeVO() {
		this(100,"",100);
	}



	public EmployeeVO(int id, String fName, int age) {
		super();
		this.id = id;
		this.fName = fName;
		this.age = age;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "EmployeeVO [id=" + id + ", fName=" + fName 
				+ ", age=" + age  + "]";
	}
	
	
	public String _toString() {
		return "EmployeeVO [id=" + id + ", fName=" + fName + ", lName=" + lName
				+ ", age=" + age + ", addressLine1=" + addressLine1
				+ ", addressLine2=" + addressLine2 + ", city=" + city
				+ ", salary=" + salary + "]";
	}
	

}