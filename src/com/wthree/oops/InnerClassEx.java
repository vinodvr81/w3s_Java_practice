package com.wthree.oops;

class OuterClass {
  int x = 10;

  class InnerClass {
    int y = 5;
  }
}

public class InnerClassEx {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}