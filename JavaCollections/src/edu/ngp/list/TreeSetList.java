package edu.ngp.list;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetList {
	public static void main(String[] args) {
		Set<Integer> nameList = new TreeSet<Integer>();

		nameList.add(-5);
		nameList.add(-1);
		nameList.add(1);
		nameList.add(0);

		System.out.println(nameList.size());
		System.out.println(nameList.toString());
	}
}
