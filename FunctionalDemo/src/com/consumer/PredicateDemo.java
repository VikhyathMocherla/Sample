package com.consumer;
import java.util.function.*;
public class PredicateDemo {
	
	String str;
	PredicateDemo(String str)
	{
		this.str=str;
	}
	public void checkString(Predicate<String> predicate)
	{
		if(predicate.test(str))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
	}

	public static void main(String[] args) {
		
		PredicateDemo obj= new PredicateDemo("Peter goes to school today");
		obj.checkString((e)->e.contains("Peter"));
		obj.checkString((e)->e.contains("Sam"));
		obj.checkString((e)->e.length()>10);
		
	}

}
