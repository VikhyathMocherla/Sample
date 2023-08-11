package com.consumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.ArrayList;
public class evaluateFeedBack {
ArrayList<Item> itemList=new ArrayList<>();
	
	evaluateFeedBack()
	{
		itemList.add(new Item(1,"999999998","Very Good",5));
		itemList.add(new Item(2,"888888875","Good",4));
		itemList.add(new Item(3,"654888999","avg",3));
	}
	
	public void forEachItem(Consumer<CallQualityFeedBack> c)
	{
		for(Item i:itemList)
		{
			c.accept(i);
		}
	}
	
	public void forEachItem(Predicate<CallQualityFeedBack> c)
	{
		for(Item i:itemList)
		{
			if(c.test(i))
			{
				System.out.println(i+" is suitable for sale");
			}
			else
			{
				System.out.println(i+" is not suitable for sale");
			}
		}
			
	}

	public static void main(String[] args) {
		
		evaluateFeedBack obj= new evaluateFeedBack();
		obj.forEachItem((e)->System.out.println(e));
		obj.forEachItem((e)->e.getRating()>3);
	}

}
