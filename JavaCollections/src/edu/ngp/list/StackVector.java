package edu.ngp.list;

import java.util.Stack;

public class StackVector {

	public static void main(String[] args) {
		Stack<String> namelist = new Stack<String>();
		
		namelist.push("NGP");
		namelist.push("NGP2");
		namelist.push("NGP3");
		
		System.out.println(namelist.size());
		
		for (String string : namelist) {
		System.out.println(namelist.peek());
			
		}
		
		System.out.println(namelist.pop());
		
		System.out.println(namelist.size());
			
	}

}
