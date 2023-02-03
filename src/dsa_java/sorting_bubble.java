package dsa_java;

import java.util.Scanner;

public class sorting_bubble {
	public void sorted(int arr[]) {
		for(int i=0;i<arr.length;i++	) {
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
            	System.out.println("enter the unsorted no.:");
            	for(int i=0;i<n-1;i++) {
            		for(int j=0;j<n-i-1;j++) {
            			if(arr[j]>arr[j+1]){
            				int temp=arr[j];
            				arr[j]=arr[j+1];
            				arr[j+1]=temp;
            			}
            		}
            	}
            	for(int i=0;i<arr.length;i++) {
            		System.out.println(arr[i]); }
			}
	}

