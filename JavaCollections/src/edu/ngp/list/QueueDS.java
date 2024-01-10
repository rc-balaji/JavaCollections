package edu.ngp.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDS {

	public static void main(String[] args) {
		Queue<String> colorList = new LinkedList<String>();
		
		colorList.add("Red");
		colorList.add("Red1");
		colorList.add("Red2");
		colorList.add("Red3");
		
		System.out.println(colorList.toString());
		
	}

}
