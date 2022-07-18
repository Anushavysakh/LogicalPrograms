package com.Assignment6.bridglabz;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		while(num!=0) {
			rev=rev*10;
			rev=rev+num%10;
			num=num/10;
		}
		System.out.println("The reverse number is : "+rev);
	}

}
