package com.day12;

import java.util.Date;

public class GreetingThreadRunnerHelloWorld extends Thread
{
	public static void main(String[] args) {
		Thread th;
		th=new GreetingThreadRunnerHelloWorld();
		th.setName("Hello World");
		th.start();
		
	}
	public void runthread()
	{
		String threadName=Thread.currentThread().getName();
		{
			try {
			for(int i= 0;i<6;i++)
			{
				Date d=new Date();
				System.out.println( d + " \t " +threadName );
			}
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		}

}
