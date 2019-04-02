package com.ruchika.map;

public class Temp {
	

	@Override
	public String toString() {
		
		return "Temp";
	}
	@Override
	public void finalize() {
		System.out.println("TEMP DELETED");
	}
}
