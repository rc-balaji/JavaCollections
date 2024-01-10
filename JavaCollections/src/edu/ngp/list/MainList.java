package edu.ngp.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainList {

	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<Integer>();
//			ArrayList<Integer> arrayList = new ArrayList<Integer>();
//			numberList.add(10);
//			numberList.add(35);
//			
		for (int i = 0; i <= 100; i += 2) {
			numberList.add(i);

		}
		
//		using ForEach or Enhanced for-each
		System.out.println("ForEach");
		for (int integer : numberList) {
			System.out.println(integer);
		}
		
//		Simple for loop
		System.out.println("Simple for loop");
		for (int i=0;i<numberList.size();i++) {
			System.out.println(numberList.get(i));
		}

//		Using Iterator
		System.out.println("Using Iterator");
		
		Iterator<Integer> iterator = numberList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
//		stream
		System.out.println("Using stream");
		
		   numberList.stream()
           .forEach(System.out::println);
		
		
		
//		System.out.println(numberList.toString());

	}

}
