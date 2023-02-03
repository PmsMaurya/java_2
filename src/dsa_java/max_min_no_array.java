package dsa_java;

import java.util.Scanner;

public class max_min_no_array {

	public static void main(String[] args) {
		System.out.print("enter the no.:"); 
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int  number[]=new int  [size];
		for(int i=0;i<size;i++) {
			number[i]=sc.nextInt();
		}
		
		/*
		 * Integer.MIN_VALUE;-------------->predefine command.
		 *  Integer.MAX_VALUE;
		 */
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<number.length;i++) {
			if(number[i]<min) {
				min=number[i];
			}
			if(number[i]>max) {
				max=number[i];
			}
		}
		System.out.println("minimum value is:"+min);
		System.out.println("maximum  value is :"+max);
		
	}

}
