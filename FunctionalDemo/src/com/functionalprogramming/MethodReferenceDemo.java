package com.functionalprogramming;

import java.util.function.Predicate;
public class MethodReferenceDemo {

	int arr[]= {12,23,11,19,25,32,16,22};
	public void checkForEven(Predicate<Integer> p)
	{
		for(int i:arr)
		{
			if(p.test(i))
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodReferenceDemo m=new MethodReferenceDemo();
		MethodInterface n= m::checkForEven;
		n.checkEven((e)->e%2==0);
	}

}
