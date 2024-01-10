package edu.ngp.list;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PQueueDS {
	public static void main(String[] args) {
		PriorityQueue<String> colorList = new PriorityQueue<String>();
		
		colorList.offer("Red");
		colorList.offer("Red1");
		colorList.offer("Red2");
		colorList.add("Red3");
		
		System.out.println(colorList.poll());
		System.out.println(colorList.toString());
		
	}
}
