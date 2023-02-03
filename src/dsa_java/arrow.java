package dsa_java;

import java.util.Scanner;

public class arrow {

	public static void main(String[] args) {

   int n=5;
   for(int i=n;i>=1;i--) {
	   for(int j=1;j<=i;j++) {
		   System.out.print(" ");
	   }
	   for(int j=i;j<=n;j++) {
		   
			  System.out.print("*");
			  }
	   for(int j=7;j<=30;j++) {
		   System.out.print(" ");
	   }
	   for(int j=1;j<=i;j++) {
		   System.out.print(" ");
	   }
	   for(int j=i;j<=n;j++) {
		   if(i==j||j==i||j==n||i==n) {
			  System.out.print("*");}
			  }
		
	   System.out.println();
	   }
	   for(int k=1;k<=31;k++) {
		   if(k==15) {
			   System.out.print("PMS");
		   }
		   else {
		   System.out.print("*");
	   }}
	   System.out.println();
	   for(int i=1;i<=n;i++) {
		   for(int j=1;j<=i;j++) {
			   System.out.print(" ");
		   }
		   for(int j=i;j<=n;j++) {
			   
				  System.out.print("*");
				  }
		   for(int j=7;j<=30;j++) {
			   System.out.print(" ");
		   }
		   for(int j=1;j<=i;j++) {
			   System.out.print(" ");
		   }
		   for(int j=i;j<=n;j++) {
			   if(i==j||j==i||j==n||i==n) {
				  System.out.print("*");}
				  }
		   System.out.println();
		   }
		   
	   
   }
   
	}


