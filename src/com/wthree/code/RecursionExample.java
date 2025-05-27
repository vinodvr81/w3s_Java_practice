package com.wthree.code;

public class RecursionExample {


	  
	  public static void main(String[] args) {
		    int result = sum(5); // 5 + 4 + 3 + 2 + 1 + sum(0)
		    System.out.println(result);
		    result = sum(10); //10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
		    System.out.println(result); 
		    result = sum(6,10); //10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
		    System.out.println(result);  //
		  }
	  
	  public static int sum(int k) {
		    if (k > 0) {
		      return k + sum(k - 1);
		    } else {
		      return 0;
		    }
		  }
	  
	  public static int sum(int start, int end) {
		    if (end > start) {
		      return end + sum(start, end - 1);
		    } else {
		      return end;
		    }
		  }
	  
	}