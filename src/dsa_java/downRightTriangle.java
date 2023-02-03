package dsa_java;

import java.util.Scanner;

public class downRightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("enter the no.");
		Scanner s=new Scanner(System.in);
		 n=s.nextInt();
		 for(int i=n;i>=1;i--) {
			 for(int j=1;j<=i;j++) {
		System.out.print("*");
	}
			 System.out.println();

}
}}