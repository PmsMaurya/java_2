package dsa_java;

import java.util.Scanner;

public class star_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("enter the no.of row and col:");
         Scanner s=new Scanner(System.in);
         n=s.nextInt();

         for(int i=1;i<=n;i++) {
        	 for(int j=1;j<=n-i;j++) {
        		 System.out.print(" ");
        	 }
        	 for(int j=1;j<=i;j++) {
        		 System.out.print(i);
        	 }
        	 for(int j=2;j<=i;j++) {
        		 System.out.print(i);
        	 }
        	 System.out.println();
         }
         for(int i=n-1;i>=1;i--) {
        	 for(int j=1;j<=n-i;j++) {
        		 System.out.print(" ");
        	 }
        	 for(int j=1;j<=i;j++) {
        		 System.out.print(i);
        	 }
        	 for(int j=2;j<=i;j++) {
        		 System.out.print(i);
        	 }
        	 System.out.println();
         }
         
         }
	}


