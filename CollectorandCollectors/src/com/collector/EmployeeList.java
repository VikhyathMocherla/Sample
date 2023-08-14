package com.collector;
import java.util.*;
import java.util.stream.*;
public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empList=new ArrayList<>();
		empList.add(new Employee("abc","def",new Department("Sales","Hyderabad"),new Designation("Manager")));
		empList.add(new Employee("pqr","xyz",new Department("Sales","Mumbai"),new Designation("Asst. Manager")));
		empList.add(new Employee("abc","def",new Department("Accounts","Pune"),new Designation("Manager")));
		empList.add(new Employee("abc","def",new Department("Accounts","Mumbai"),new Designation("senior Manager")));
		
		
		List<Employee> elist= empList.stream().filter(e->e.getDepartment().getDepartmentName().equals("Sales") && e.getDesignation().getDesignation_type().equals("Manager")).collect(Collectors.toList());
		System.out.println(elist);
		
		
		/*
		List<Employee> elist =empList.stream().filter(e->e.getDepartment().getLocation().equals("Mumbai")).collect(Collectors.toList()));
		System.out.println(elist);
		*/
		
		/*
		List<String> elist=empList.stream().collect(Collectors.mapping((Employee e)->e.getFirstName()+" "+e.getLastName(),Collectors.toList()));
		System.out.println(elist);
		*/
	}

}
''