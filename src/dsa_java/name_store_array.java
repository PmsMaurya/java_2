package dsa_java;

import java.util.Scanner;

// Take an array of names as input from the user and print them on the screen.
public class name_store_array {

	public static void main(String[] args) {
	System.out.print("enter the no. of names:");
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	String names[]=new String [size];
	for(int i=0;i<size;i++) {
		names[i]=sc.next();
	}
	for(int i=0;i<names.length;i++) {
		System.out.println(i+1+ " "+names[i]);
	}
	}

}
