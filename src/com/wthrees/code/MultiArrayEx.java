package com.wthrees.code;


public class MultiArrayEx{
	
	public static void main(String[] args) {
		int[][] myNumbers = { {1, 2, 3, 4, 5}, { 6, 7, 8, 9, 10} };
		//System.out.println(myNumbers[1][2]);
		System.out.println("\n");
		System.out.println("\n");
		for(int[] i: myNumbers) {
			for(int j: i) {
			System.out.println(j);
			}
		}
	}
}