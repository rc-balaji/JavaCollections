package edu.ngp.list;

import java.util.LinkedList;
import java.util.Vector;

public class VectorList1 {

	public static void main(String[] args) {
		Vector<String> nameList = new Vector<String>();
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
