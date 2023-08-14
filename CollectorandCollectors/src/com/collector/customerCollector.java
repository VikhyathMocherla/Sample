package com.collector;
import java.util.*;
import java.util.stream.*;
public class customerCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Customer> customerList=new ArrayList();
		customerList.add(new Customer("abc","def","abc@gmail.com",new Location("Hyderabad","Telangana")));
		customerList.add(new Customer("pqr","lmn","pqr@gmail.com",new Location("Delhi","Delhi")));
		customerList.add(new Customer("abc","def","abc@gmail.com",new Location("Mumbai","Maharashtra")));
		customerList.add(new Customer("xyz","abc","xyz@gmail.com",new Location("Bangalore","Karnataka")));
		
		List<String> customer_list=customerList.stream().map((e)->e.getFirstName()+" "+e.getLastName()+" "+e.getLocation()).collect(Collectors.toList());
		System.out.println(customer_list);
	}

}
