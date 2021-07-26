package com.ust.examples;
/*
 * 
 */
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;

public class Collection6 {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put("1", "one");
		ht.put("2","Two");
	    ht.put("3", "Three"); 
	    Enumeration e = ht.keys();
	    while (e.hasMoreElements()) {
	    	System.out.println(e.nextElement());
	    }

	}

}
