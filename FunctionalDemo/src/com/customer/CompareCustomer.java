package com.customer;
import java.util.*;
import com.customer.Customer;
public class CompareCustomer {

	public static void main(String[] args) {
		ArrayList<Customer> arraylist=new ArrayList<>();
		arraylist.add(new Customer("abc","1 month","Hyderabad",100));
		arraylist.add(new Customer("def","2 months","Mumbai",200));
		arraylist.add(new Customer("xyz","1 month","Delhi",100));
		arraylist.add(new Customer("pqr","3 months","Bangalore",300));
		arraylist.add(new Customer("str","1 month","Hyderbad",250));

		arraylist.sort((i,j)->{
			if(i.getPlanAmount()==j.getPlanAmount())
			{
				return 0;
			}
			else if(i.getPlanAmount()>j.getPlanAmount())
			{
				return 1;
			}
			else
			{
				return -1;
			}
		});
		arraylist.removeIf((i)->i.getPlanAmount()<200);
		arraylist.forEach(System.out::println);
	}
}
