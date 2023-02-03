package dsa_java;

import java.util.Scanner;

public class Daigonal_pattern {

	public static void main(String[] args) {
		int n;
		System.out.println("enter the no.");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				
					System.out.print(" ");
				
			}
			for(int j=1;j<i;j++) {
				if(j==i||j==1||i==n) {
				System.out.print("*");}
				else {
					System.out.print(" ");
				}
			}
			
			for(int j=1;j<=i;j++) {
				if(j==i||i==n) {
					System.out.print("*");}
					else {
						System.out.print(" ");
					}
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--) {
			for(int j=i;j<=n;j++) {
				
					System.out.print(" ");
				
			}
			for(int j=1;j<i;j++) {
				if(j==i||j==1) {
				System.out.print("*");}
				else {
					System.out.print(" ");
				}
			}
			for(int j=1;j<=i;j++) {
				if(j==i) {
					System.out.print("*");}
					else {
						System.out.print(" ");
					}
			}
			System.out.println();
		}

	}

}
