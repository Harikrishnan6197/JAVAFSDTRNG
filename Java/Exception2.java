package com.ust.examples;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Exception2 {
public static void findFile() throws IOException{
	File newFile = new File("test.txt");
	FileInputStream stream = new FileInputStream(newFile);
	
}


	public static void main(String[] args) {
	try {
	    findFile();	

	}
catch(IOException e) {
System.out.println(e);	
}
}
}
