package com.Assignment6.bridglabz;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	    int firstTerm = 0, secondTerm = 1;
	   
	    System.out.println("Fibonacci Series till :");
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    
	    for (int i = 1; i <= n; ++i) {
	      System.out.print(firstTerm + ", ");
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }
	}
}


