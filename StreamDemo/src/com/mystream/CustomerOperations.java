package com.mystream;
import java.util.*;
import java.util.stream.*;
public class CustomerOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> list=new ArrayList();
		list.add(new Customer("abc","Mumbai","type1",1,200));
		list.add(new Customer("def","Delhi","type2",2,400));
		list.add(new Customer("pqr","Hyderabad","type3",3,600));
		list.add(new Customer("xyz","Delhi","type1",4,200));
		list.add(new Customer("uvw","Bangalore","type2",2,400));
		list.add(new Customer("lmn","Mumbai","type3",5,600));
		
		Stream<Customer> stream=list.stream();
		
		//1. stream.filter((e)->e.getPlanRange()>3).forEach(System.out::println);
		//2. stream.filter((e)->e.getAmount()>500).forEach(System.out::println);
		//3. stream.filter((e)->e.getLocation().equals("Mumbai")).map((e)->e.getAmount()*20/100+e.getAmount()+" "+e.getLocation()).forEach(System.out::println);
		//4. System.out.println(stream.allMatch((e)->e.getAmount()>300));
		//5. System.out.println(stream.anyMatch((e)->e.getAmount()>600));
	}

}
