package com.ust.examples;
// Example of for loop

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String[] str = new String[5];
		String[] str ={"balu","anand","dhanish","hari","sreehari"};
for(int i=0;i< str.length;i++) {
	if(str[i].equals("hari"))
		//break;
		continue;
	System.out.println(str[i]);
	
}

	}

}
