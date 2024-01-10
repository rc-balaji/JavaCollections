package edu.ngp.list;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class DEQu {
	public static void main(String[] args) {
		Deque<String> colorList = new ArrayDeque<String>();
		
		colorList.offer("Red");
		colorList.offer("Red1");
		colorList.offer("Red2");
		colorList.add("Red3");
		colorList.offerFirst("RED0");
		colorList.offerLast("REDLast");
//		System.out.println(colorList.poll());
		System.out.println(colorList.toString());
		
	}
}
