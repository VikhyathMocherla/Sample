package com.collector;
import java.util.*;
import java.util.stream.*;
public class MappingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		List<String> mydevicelist= Arrays.asList("PC","Mainframe","Laptop","Terminal","Teleprinter");
		List<String> mylist=mydevicelist.stream().collect(Collectors.mapping((e)->e.toString().toUpperCase(), Collectors.toList()));
		System.out.println(mylist);
		*/
		
		ArrayList<CallQuality> callQualityList=new ArrayList<>();
		callQualityList.add(new CallQuality(1,2,4,"9988745554"));
		callQualityList.add(new CallQuality(2,4,3,"8874599554"));
		callQualityList.add(new CallQuality(3,1,5,"9788555488"));
		callQualityList.add(new CallQuality(4,2,4,"9088055418"));
		
		/* 1. Mapping
		List<String> mycall_list= callQualityList.stream().collect(Collectors.mapping((CallQuality call)->call.getCallDuration()+"<->"+call.getDropRate(),Collectors.toList()));
		System.out.println(mycall_list);
		*/
		
		/* 2. Count
		Long count=mycall_list.stream().collect(Collectors.counting());
		System.out.println(count);
		*/
		
		/* 3. minBy and 4. maxBy fuctions
		CallQuality quality=callQualityList.stream().collect(Collectors.maxBy((e1,e2)->{
			if(e1.getDropRate()==e2.getDropRate())
			{
				return 0;
			}
			else if(e1.getDropRate()>e2.getDropRate())
			{
				return 1;
			}
			else
			{
				return -1;
			}
		})).get();
		System.out.println(quality);
		*/
	}
}
