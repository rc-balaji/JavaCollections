package edu.ngp.list;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMAPS {
	public static void main(String[] args) {

		LinkedHashMap<String, Integer> playersScore = new LinkedHashMap<String, Integer>();

		playersScore.put("MSD", 183);
		playersScore.put("RS", 264);
		playersScore.put("RS", 265);
		playersScore.put("VK", 183);
		playersScore.put("SKY", 117);

		System.out.println(playersScore.get("RS"));

	}
}
