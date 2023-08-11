package com.myref;

public class SimpleInterest {

SimpleInterest(double pr,double rt,double tm)
{
	System.out.println(pr*rt*tm/100);
}
public static void simpleInterestCalculator(double pr,double rt,double tm)
{
	System.out.println(pr*rt*tm/100);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interest interest=SimpleInterest::new;
		interest.SimpleInterest(12000,2,3);
	}

}
