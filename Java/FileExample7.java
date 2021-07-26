package com.ust.examples;
/*
 * string reader
 */
import java.io.IOException;
import java.io.StringReader;
public class FileExample7 {
   public static void main(String[] args) {
        String str = "Hello World! \nThis is StringReader Program.";
        StringReader sr = new StringReader(str);
        int i=0;
        try {
	       while((i=sr.read())!=-1){
		  System.out.print((char)i);
               }
	} catch (IOException e) {
  	       e.printStackTrace();
	}
    }
} 
