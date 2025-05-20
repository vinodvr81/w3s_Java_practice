package com.wthree.oops;
import java.time.*;
import java.time.format.DateTimeFormatter; 


public class DateTimeEx {
  public static void main(String[] args) {  
    LocalDate myObj = LocalDate.now(); 
    System.out.println(myObj); 
    System.out.println(LocalDateTime.now());
    System.out.println(DateTimeFormatter.ISO_DATE);
    System.out.println(LocalTime.now());
    System.out.println(DateTimeFormatter.BASIC_ISO_DATE);
    LocalDateTime myDateObj = LocalDateTime.now();
    System.out.println("Before formatting: " + myDateObj);
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
  }
}