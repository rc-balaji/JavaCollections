package edu.ngp.list;

import java.util.Hashtable;

public class HashMapOP {

	public static void main(String[] args) {
	
		Hashtable<String, Integer> playersScore = new Hashtable<String, Integer>();
		
		playersScore.put("MSD", 183);
		playersScore.put("RS", 264);
		playersScore.put("RS", 265);
		playersScore.put("VK", 183);
		playersScore.put("SKY", 117);
		
		System.out.println(playersScore.get("RS"));
		
	}

}
