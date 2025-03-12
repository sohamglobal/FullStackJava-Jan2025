package com.sharayu.programs;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		//for min heap
		PriorityQueue<Integer> nums=new PriorityQueue<Integer>();
		//for max heap
		//PriorityQueue<Integer> nums=new PriorityQueue<Integer>(Comparator.reverseOrder());
		nums.add(23);
		nums.add(75);
		nums.add(9);
		nums.add(13);
		nums.add(45);
		//nums.add(null); not allowed
		nums.add(75);
		System.out.println(nums);
	}

}
