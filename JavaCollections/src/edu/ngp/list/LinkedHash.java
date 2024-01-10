package edu.ngp.list;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHash {
	public static void main(String[] args) {
		Set<String> nameList = new LinkedHashSet<String>();

		nameList.add("Apple");
		nameList.add("Apple");
		nameList.add("Orange");

		System.out.println(nameList.size());
		System.out.println(nameList.toString());
	}
}
