package com.sharayu.programs;

public class NoThread {
	
	public void show()
	{
		for(int i=1;i<=5;i++)
			System.out.println(i);
	}
	
	public static void main(String[] args) {
		NoThread obj1=new NoThread();
		NoThread obj2=new NoThread();
		
		System.out.println("Object-1");
		obj1.show();
		System.out.println("Object-2");
		obj2.show();
		
	}

}
