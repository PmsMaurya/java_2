package dsa_java;

import java.util.Scanner;

public class trianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n;
    System.out.print("enter the no. of lines:");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    for(int i=1;i<=n;i++) {
    	for(int j=1;j<=i;j++) {
    		System.out.print("*");
    	}
    	System.out.println();
    }
	}

}
