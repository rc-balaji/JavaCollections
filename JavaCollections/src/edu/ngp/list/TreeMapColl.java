package edu.ngp.list;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapColl {

	public static void main(String[] args) {
		TreeMap<String, Integer> playersScore = new TreeMap<String, Integer>();

		playersScore.put("MSD", 183);
		playersScore.put("RS", 264);
		playersScore.put("RS", 260);
		playersScore.put("VK", 183);
		playersScore.put("SKY", 117);

		System.out.println(playersScore.get("RS"));

	}

}
