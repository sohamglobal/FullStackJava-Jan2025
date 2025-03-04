package com.sharayu.programs;

class Praffull implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println("Hello from Praffull "+i);
		}
	}
	
}

class Sharayu implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.println("Hi from Sharayu "+i);
		}
	}
	
}


public class UsingRunnable {
	public static void main(String[] args) {
		Thread t1=new Thread(new Praffull());
		Thread t2=new Thread(new Sharayu());
		t1.start();
		t2.start();
	}

}
