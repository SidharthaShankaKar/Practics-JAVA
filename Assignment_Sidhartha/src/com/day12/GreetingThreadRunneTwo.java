/**
 * 
 */
package com.day12;

import java.util.Date;

/**
 * @author SIDHARTHA
 *
 */
public class GreetingThreadRunneTwo implements Runnable{

	
	private String GreetingThtead;
	public GreetingThreadRunneTwo(String string) {
		this.GreetingThtead=GreetingThtead;
	}

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		GreetingThreadRunneTwo g1=new GreetingThreadRunneTwo("Hello");
		GreetingThreadRunneTwo g2= new GreetingThreadRunneTwo("Goodby");
		Thread t1= new Thread(g1);
		Thread t2= new Thread(g2);
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		try {
			for(int i = 0;i < 10;i++) {
				Date d=new Date();
				System.out.println(d + " " + GreetingThtead);
				Thread.sleep(1000);
			}
		}catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
