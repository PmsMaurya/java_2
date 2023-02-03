package dsa_java;

import java.util.Scanner;

public class Selection_sorting {
	public static void selection(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		System.out.println("enter the no. of elements:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
      for(int i=0;i<n-1;i++) {
    	  int min=i;
    	  for(int j=i+1;j<n;j++) {
    		  if(arr[j]<arr[min]) {
    			  min=j;
    		  }
    	  }
    	  int temp=arr[i];
    	  arr[i]=arr[min];
    	  arr[min]=temp;
      
      }
//      Selection_sorting b=new Selection_sorting();
//      
//     b. selection(arr);
      selection(arr);
	}

}
