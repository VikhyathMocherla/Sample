package com.consumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.ArrayList;
public class ConsumerDemo {
	
	ArrayList<Item> itemList=new ArrayList<>();
	
	ConsumerDemo()
	{
		itemList.add(new Item(1,"Coffee",20));
		itemList.add(new Item(2,"Ice Tea",30));
		itemList.add(new Item(3,"Espresso",40));
		itemList.add(new Item(4,"Latte",25));
	}
	
	public void forEachItem(Consumer<Item> c)
	{
		for(Item i:itemList)
		{
			c.accept(i);
		}
	}
	
	public void forEachItem(Predicate<Item> c)
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
	
	public void forEachItem(Supplier<Item> c)
	{
		for(Item i:itemList)
		{
			System.out.println("Price increased for item "+i+" "+(i.getPrice()+c.get()));
		}
	}
	
	public void forEachItem(Function<Item,Float> function)
	{
		for(Item i:itemList)
		{
			System.out.println(function.apply(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Item item1=new Item(1,"Coffee",20);
		Consumer<Item> c=(e)->System.out.println("Item name "+e.getItemName()+"Item Price "+e.getPrice());
		c.accept(item1);
		*/
		
		ConsumerDemo obj= new ConsumerDemo();
		/*obj.forEachItem((e)->System.out.println(e));
		obj.forEachItem((e)->e.getPrice()>25);
		obj.forEachItem(()->50);
		*/
		
		obj.forEachItem((item)->item.getPrice()>10);
		
	}

}
