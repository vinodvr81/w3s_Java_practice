package com.wthree.oops;

class OuterClassEx {
  int x = 10;

  class InnerClass {
    public int myInnerMethod() {
      return x;
    }
  }
}

public class InnerMethodAccessEx {
  public static void main(String[] args) {
	  OuterClassEx myOuter = new OuterClassEx();
	  OuterClassEx.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.myInnerMethod());
  }
}