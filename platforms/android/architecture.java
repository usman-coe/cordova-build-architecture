package org.apache.cordova.file;

import java.io.File;
import java.io.FileReader;

public class FilenotFound_Demo {
    
   public static void main(String args[]){		
      File file=new File("E://file.txt");
      FileReader fr = new FileReader(file); 
   }
   
}