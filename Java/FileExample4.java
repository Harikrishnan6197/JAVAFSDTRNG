package com.ust.examples;
import java.io.File;

class FileExample4{
  public static void main(String[] args) {
   
    File file = new File("C:\\Users\\ustjava19\\old.txt");
      
    try {
      file.createNewFile();
    }
    catch(Exception e) {
      e.getStackTrace();
    }
    File newFile = new File("C:\\Users\\ustjava19\\newFileName");

    boolean value = file.renameTo(newFile);

    if(value) {
      System.out.println("The name of the file is changed.");
    }
    else {
      System.out.println("The name cannot be changed.");
    }
  }
}
