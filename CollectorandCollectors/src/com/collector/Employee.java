package com.collector;

public class Employee {
	  private String firstName ;
  private String lastName;
  private Department department;
  private Designation designation ;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Designation getDesignation() {
		return designation;
	}
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}
	public Employee() {
		
	}
	public Employee(String firstName, String lastName, Department department, Designation designation) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", department=" + department
				+ ", designation=" + designation + "]";
	}   
}
    
public class Department 
{ 
	  private String departmentName;
	  private String location ;
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Department(String departmentName, String location) {
		super();
		this.departmentName = departmentName;
		this.location = location;
	}
} 
 
public class Designation 
 { 
    private String designation_type;

	public String getDesignation_type() {
		return designation_type;
	}

	public void setDesignation_type(String designation_type) {
		this.designation_type = designation_type;
	}

	public Designation(String designation_type) {
		super();
		this.designation_type = designation_type;
	}
    
 } 

