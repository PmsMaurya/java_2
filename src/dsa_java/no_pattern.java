package dsa_java;

import java.util.Scanner;

public class no_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("enter the no.");
		Scanner s=new Scanner(System.in);
		 n=s.nextInt();
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=n-i+1;j++) {
				 System.out.print(j);
	}
System.out.println();
}
}}