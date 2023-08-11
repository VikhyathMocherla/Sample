package com.consumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.ArrayList;
public class RechargeConsumerData 
{
	ArrayList<Recharge> rList=new ArrayList<>();
	
	RechargeConsumerData()
	{
		rList.add(new Recharge(1,200,"01-10-2023"));
		rList.add(new Recharge(2,250,"01-11-2023"));
		rList.add(new Recharge(3,300,"01-12-2023"));	
	}
	public void forEachItem(Consumer<Recharge> c)
	{
		for(Recharge r:rList)
		{
			c.accept(r);
		}
	}
	public void forEachItem(Function<Recharge,String> function)
	{
		for(Recharge r:rList)
		{
			System.out.println(function.apply(r));
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		RechargeConsumerData obj=new RechargeConsumerData();
		obj.forEachItem((c)->System.out.println(c));
		obj.forEachItem((c)->c.getCustomerId();

	}

}
