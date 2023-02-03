package dsa_java;

import java.util.Scanner;

public class shadow_no_triangle {

	public static void main(String[] args) {
		int n;
		System.out.print("enter the no.of row and col:");
         Scanner s=new Scanner(System.in);
         n=s.nextInt();
    //space
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=n-i;j++) {
        		System.out.print(" ");
        	}
        	//first part 
        	for(int j=i;j>=1;j--) {
        		System.out.print(j);
        	}
        	for(int j=2;j<=i;j++) {
        		System.out.print(j);
        	}
        	System.out.println();
        }
		

	}

}
