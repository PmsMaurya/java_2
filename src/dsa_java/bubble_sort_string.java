package dsa_java;

import java.util.Scanner;

public class bubble_sort_string {

	public static void main(String[] args) {
		System.out.println("enter the no. of name:");
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    String arr[]=new String [n];
	    System.out.print("unsorted String:");
	    for(int i=0;i<n;i++) {
	    	arr[i]=sc.next();
	    	System.out.println(arr[i]);
	    }
	    for(int i=0;i<n-1;i++) {
	    	for(int j=0;j<n-1-i;j++) {
	    		if(arr[j].compareTo(arr[j+1])>0) {
	    			
	    			 String temp=arr[j];
	    			arr[j]=arr[j+1];
	    			arr[j+1]=temp;
	    		}
	    	}
	    }
	    System.out.println("sorted string are:");
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println(arr[i]);
	    }
	}

}
