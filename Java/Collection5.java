package com.ust.examples;
/*
 * 
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collection5 {

	public static void main(String[] args) {
		List list = Arrays.asList("one two three four five six one three four".split(" "));
		System.out.println("List:"+list);
		
		List sublist = Arrays.asList("three Four".split(" "));
		System.out.println("SubList:"+sublist);
		System.out.println("IndexofSublist: " +Collections.indexOfSubList(list, sublist));
		System.out.println("lastIndexofSublist: " +Collections.lastIndexOfSubList(list, sublist));
	}

}
