package dsa_java;

import java.util.Scanner;

public class pascals_triangle {

	public static void main(String[] args) {
int n;
System.out.print("enter the no.:");
Scanner s=new Scanner(System.in);
n=s.nextInt();
for(int i=0;i<=n;i++) {
	for(int j=1;j<=n-i;j++) {
		System.out.print(" ");
		
	}
	System.out.print(" "+(int)Math.pow(11, i));
	System.out.println(" ");
}
}

	}


