package com.wthree.adv;

public class ThreadExample extends Thread {
  public static int amount = 0;

  public static void main(String[] args) {
	 ThreadExample thread = new ThreadExample();
    thread.start();
    System.out.println(amount);
    amount++;
    System.out.println(amount);

    }
  
  public void run() {
    amount++;
  }
}