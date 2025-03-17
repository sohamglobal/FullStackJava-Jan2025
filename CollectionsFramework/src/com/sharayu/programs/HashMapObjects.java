package com.sharayu.programs;

import java.util.HashMap;

import com.praffull.classes.Mobile;

public class HashMapObjects {
	public static void main(String[] args) {
		HashMap<Integer, Mobile> map=new HashMap<>();
		Mobile m1=new Mobile("galaxy s25 5g","samsung",12,256,"navy",80999);
		Mobile m2=new Mobile("t3 pro 5g","vivo",8,256,"orange",24999);
		Mobile m3=new Mobile("galaxy f05","samsung",4,64,"blue",6249);
		
		map.put(1, m1);
		map.put(2, m2);
		map.put(3, m3);
		
		System.out.println(map.get(3));
	}

}
