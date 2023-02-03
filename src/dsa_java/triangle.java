package dsa_java;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		
		int n;
		System.out.print("enter the no.of row and col:");
         Scanner s=new Scanner(System.in);
         n=s.nextInt();
       
         for(int i=1;i<=n;i++) {
        	 for(int j=1;j<=n-i;j++) {
        		 System.out.print(" ");
        	 }
        	 for(int j=1;j<=i;j++) {
        		 System.out.print(i+" ");
        	 }
        	 System.out.println();
         }
	}

}
