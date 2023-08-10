package com.threadutil;

class MyChildThread extends Thread
{
	public void run()
	{
		Thread th=Thread.currentThread();
		System.out.println("Child thread started "+th.getName());
	}
}
public class MyThread {

	public static void main(String[] args) {
		Thread th=Thread.currentThread();
		System.out.println(th.getName());
		MyChildThread childThread1=new MyChildThread();
		MyChildThread childThread2=new MyChildThread();
		childThread1.setName("Child thread 1");
		childThread2.setName("Child thread 2");
		childThread1.start();
		
		childThread2.start();

	}

}
