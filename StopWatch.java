package com.Assignment6.bridglabz;

import java.sql.Time;
import java.util.Scanner;




public class StopWatch {
	public long starttime=0;
	public long endtime=0;
	public long elapsed_time;
	
	
	
	public static void main(String[] args) {
		 double starttime;
		 double endtime;
		 double elapsed_time;
		Scanner sc=new Scanner(System.in);
		System.out.println("Press '1' to Start Time: ");
		int n1=sc.nextInt();
		starttime=System.currentTimeMillis();	
		System.out.println("The start time is :"+starttime);

		System.out.println();
		System.out.println("Press '2' to Stop Time: ");
		int n2=sc.nextInt();	
		endtime=System.currentTimeMillis();
		System.out.println("Stop Time is: "+endtime);
		System.out.println();
		elapsed_time=(endtime-starttime)/1000;
		System.out.println("Total Time Elapsed(in millisec) is:"+elapsed_time);
		
	}

}
