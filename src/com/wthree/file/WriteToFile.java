package com.wthree.file;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteToFile {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("/home/p/Documents/java_prac/wThreesS/src/com/wthree/file/filename.txt");
      myWriter.write("Hello Vinod Vukkalam do you know Files in Java might be tricky, but it is fun enough!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println(e);
      e.printStackTrace();
    }
  }
}