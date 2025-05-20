
package com.wthree.file;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class ReadLinesExample {
    public static void main(String[] args) {
    	String filePath = "/home/p/Documents/java_prac/wThreesS/src/com/wthree/file/filename.txt";

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
