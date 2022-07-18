package com.Assignment6.bridglabz;

import java.util.Scanner;

public class StopWatch {
	public long starttime=0;
	public long endtime=0;
	public double elapsed_time;
	
	public void Start() {
		starttime=System.currentTimeMillis();
		System.out.println("The start time is :"+starttime);
	}
	public void End() {
		endtime=System.currentTimeMillis();
		System.out.println("Stop Time is: "+endtime);
	}
	public  double ElaspeTime() {
		elapsed_time=(endtime-starttime)/1000;
		return elapsed_time;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StopWatch obj=new StopWatch();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press '1' to Start Time: ");
		int n1=sc.nextInt();
		obj.Start();

		System.out.println();
		System.out.println("Press '2' to Stop Time: ");
		int n2=sc.nextInt();	
		obj.End();
		System.out.println();
		System.out.println("Total Time Elapsed(in millisec) is:"+obj.elapsed_time);
		obj.ElaspeTime();
		
	}

}
