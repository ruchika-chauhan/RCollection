package com.ruchika.map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
	public static void main(String[] args) throws InterruptedException {
		//HashMap<Temp,String> hm= new HashMap<>();
		WeakHashMap<Temp,String> hm=new WeakHashMap<>();
		Temp t=new Temp();
       hm.put(t, "TEMP VALUE");
       System.out.println("MAP:::"+hm);
       t=null;
       Thread.sleep(1000);
       System.gc();
       System.out.println("MAP after Refernce NULL :"+hm);
	}
}
