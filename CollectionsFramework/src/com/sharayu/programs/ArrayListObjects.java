package com.sharayu.programs;

import java.util.ArrayList;

import com.praffull.classes.Mobile;

public class ArrayListObjects {
	public static void main(String[] args) {
		Mobile m1=new Mobile("galaxy s25 5g","samsung",12,256,"navy",80999);
		Mobile m2=new Mobile("t3 pro 5g","vivo",8,256,"orange",24999);
		Mobile m3=new Mobile("galaxy f05","samsung",4,64,"blue",6249);
		
		ArrayList<Mobile> mobileList=new ArrayList<Mobile>();
		mobileList.add(m1);
		mobileList.add(m2);
		mobileList.add(m3);
		
		//System.out.println(mobileList);
		
		for(int i=0;i<mobileList.size();i++)
			System.out.println(mobileList.get(i).getModelName());
		
		
	}

}
