package com.wthree.file;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {
        String filePath = "/home/p/Documents/java_prac/wThreesS/src/com/wthree/file/filename.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line); // process each line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
