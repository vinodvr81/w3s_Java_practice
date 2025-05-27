package com.wthree.code;


public class forExample {
    public static void main(String[] args) {
    	for (int i = 0; i < 5; i++) {
    		  System.out.println(i + " Hello, I am against Politics!");
    		}
    	System.out.print("\n");
    	System.out.print("\n");
    	for (int i = 1; i <= 2; i++) {
    		  for (int j = 1; j <= 3; j++) {
    		    System.out.print(i + "," + j + " ");
    		  }
    		}
    	System.out.print("\n");
    	System.out.print("\n");
    	int[] myNumbers = {1, 2, 3, 4, 5};
    	for (int ab : myNumbers) {
    	  System.out.println(ab);
    	}

        }
    }