package com.collector;
import java.util.*;
import java.util.stream.*;
public class ListCollector {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		List<Integer> numlist=Arrays.asList(12,23,11,19,55,23,17,22,15);
		List<Integer> newlist=numlist.stream().filter((e)->e>20).map((e)->e*e).collect(Collectors.toList());
		System.out.println(newlist);
		*/
		
		ArrayList<CallQuality> callQualityList=new ArrayList();
		callQualityList.add(new CallQuality(1,2,4,"9988745554"));
		callQualityList.add(new CallQuality(2,4,3,"8874599554"));
		callQualityList.add(new CallQuality(3,1,5,"9788555488"));
		callQualityList.add(new CallQuality(4,2,4,"9088055418"));
		
		/*toList function
		List<String> call_list=callQualityList.stream().filter((e)->e.getCallDuration()>=2).map((e)->e.getMobileNo()+" ,"+e.getDropRate()).collect(Collectors.toList());
		System.out.println(call_list);
		*/
		
		//toSet function
		Set<String> call_set=callQualityList.stream().filter((e)->e.getCallDuration()>=2).map((e)->e.getMobileNo()+" ,"+e.getDropRate()).collect(Collectors.toSet());
		System.out.println(call_set);
	}

}
