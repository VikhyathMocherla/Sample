package com.threadutil;

import java.util.Scanner;

class UserDetails extends Thread
{
	public void acceptDetails()
	{
		Scanner n=new Scanner(System.in);
		String username=n.nextLine();
		String Email=n.nextLine();
	}
	public void run()
	{
		acceptDetails();
	}
}

public class myEmail {

	public static void main(String[] args) {
		UserDetails u=new Userdetails();
		u.start();
		

	}

}
