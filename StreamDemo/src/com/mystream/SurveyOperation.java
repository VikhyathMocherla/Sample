package com.mystream;
import java.util.*;
import java.util.stream.*;
public class SurveyOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<SurveyReport> surveyList=new ArrayList<>();
		surveyList.add(new SurveyReport(1,"abc","Delhi",10,30,5));
		surveyList.add(new SurveyReport(2,"xyz","Mumbai",12,40,4));
		surveyList.add(new SurveyReport(3,"pqr","Hyderabad",15,50,6));
		surveyList.add(new SurveyReport(4,"def","Delhi",20,20,5));
		surveyList.add(new SurveyReport(5,"lmn","Bangalore",10,30,4));
		
		Stream<SurveyReport> surveystream=surveyList.stream();
		
		/* 1
		SurveyReport maxRequests=surveystream.max((d1,d2)->{
			if(d1.getTotal_connection_request()==d2.getTotal_connection_request())
			{
				return 0;
			}
			else if(d1.getTotal_connection_request()>d2.getTotal_connection_request())
			{
				return 1;
			}
			else
			{
				return -1;
			}
		}).get();
		System.out.println(maxRequests);*/
		
		/* 2
		 int i=surveystream.map((e)->e.getNo_of_days_for_request_completion()).reduce(0,(e1,e2)->e1+e2);
		 System.out.println(i/surveyList.size());*/
		
		/* 3
		int i= surveyList.stream().map((e)->e.getAverage_request_per_day()).reduce(0,(a,b)->a+b);
		System.out.println(i); */
		
		/* 4
		Integer count=(int) surveystream.filter((e)->(e).getLocation().equals("Delhi")).count();
		System.out.println("Number of reports are: "+count);*/
	}

}
