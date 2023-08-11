package com.myfunctional;

public class FunctionalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate add=(a,b)->System.out.println(a+b);
		add.calculateResult(12, 23);
	}

}
