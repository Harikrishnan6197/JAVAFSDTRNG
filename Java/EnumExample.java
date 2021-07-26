package com.ust.examples;
enum CovidWaves{
	wave1,wave2,wave3;
}
public class EnumExample {

	public static void main(String[] args) {
	//CovidWaves cv = CovidWaves.wave1;
	System.out.println(CovidWaves.values());
	for(CovidWaves cv:CovidWaves.values()) {
		System.out.println(cv.name());
	}

	}

}
