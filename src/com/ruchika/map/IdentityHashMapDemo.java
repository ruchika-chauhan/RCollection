package com.ruchika.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
	public static void main(String[] args) {
		IdentityHashMap<Integer,String> ihm=new IdentityHashMap<>();
		ihm.put(new Integer(10), "Ruchika");
		ihm.put(new Integer(10), "Chauhan");
		System.out.println("IdentityHashMap:::"+ihm);
		
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(new Integer(10), "Ruchika");
		hm.put(new Integer(10), "Chauhan");
		System.out.println("HashMap:::"+hm);
	}

}
