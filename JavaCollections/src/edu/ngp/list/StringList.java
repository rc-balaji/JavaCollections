package edu.ngp.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringList {

	public static void main(String[] args) {
	
		List<String> nameList = new ArrayList<String>();
		nameList.add("Abc");
		nameList.add("Ghi");
//		nameList.add("Abc");
		nameList.add("Def");
		nameList.add("Ghi");
		
		if (nameList.contains("Abc")) {
			System.out.println("Found at index "+nameList.indexOf("Ghi"));
		}else {
			System.out.println("Not Found");
		}
		
		System.out.println(nameList.toString());
			
//		nameList.remove(2);
		
		System.out.println(nameList.toString());
		
//		Sorting a List
		
		Collections.sort(nameList);
		
		System.out.println(nameList.toString());
		
		
	}

}
