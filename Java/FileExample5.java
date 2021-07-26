package com.ust.examples;

import java.io.File;

class FileExample5 {
  public static void main(String[] args) {

    
    File files = new File("C:\\Users\\ustjava19");

   
    String[] filesList = files.list();

    for(String str : filesList) {
      System.out.println(str);
    }
  }
}

