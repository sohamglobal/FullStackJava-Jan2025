package com.sharayu.programs;

public class WithThread extends Thread {

	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println(Thread.currentThread().getName()+" : "+i);
	}
	
	public static void main(String[] args) {
		Thread t1=new Thread(new WithThread());
		Thread t2=new Thread(new WithThread());
		
		System.out.println("Object-1");
		t1.start();
		System.out.println("Object-2");
		t2.start();
		
	}

	
}
