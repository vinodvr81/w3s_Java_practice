
package com.wthree.file;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadAsStringEx {
    public static void main(String[] args) {
    	String filePath = "/home/p/Documents/java_prac/wThreesS/src/com/wthree/file/filename.txt";

        try {
            String content = Files.readString(Path.of(filePath));
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
