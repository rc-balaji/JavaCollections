package edu.ngp.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

	public static void main(String[] args) {
		LinkedList<String> nameList = new LinkedList<String>();
		nameList.add("Abc");
		nameList.add("Ghi");

		nameList.add("Def");
		nameList.add("Ghi");
		
		nameList.addFirst("Hello");
		nameList.addLast("EndHello");
		
		for (String string : nameList) {
			System.out.println(string);
		}
		
		
	}

}
