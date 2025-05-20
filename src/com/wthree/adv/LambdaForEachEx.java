
package com.wthree.adv;
import java.util.ArrayList;

public class LambdaForEachEx {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(15);
    numbers.add(92);
    numbers.add(82);
    numbers.add(11);
    numbers.forEach( (n) -> { System.out.println(n); } );
  }
}