package com.wthree.oops;

import com.wthree.oops.EnumEx.Level;

public class enumExample {

  public static void main(String[] args) {
    for(Level myVar: Level.values()) { 
      System.out.println(myVar);
     }
  }
}