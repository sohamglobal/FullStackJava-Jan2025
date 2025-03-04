package com.sharayu.programs;

class MyClass extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Welcome to multithreading "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("thread interrupted...");
			}
		}
		System.out.println("Thread terminated...");
	}
}


public class TimedWaiting {
	public static void main(String[] args) {
		MyClass obj=new MyClass();
		obj.start();
	}
	

}
