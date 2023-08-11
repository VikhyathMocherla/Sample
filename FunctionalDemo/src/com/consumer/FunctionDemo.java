package com.consumer;
import java.util.function.*;
public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,Integer> function=(str)->str.length();
		System.out.print(function.apply("Hello World"));
	}

}
