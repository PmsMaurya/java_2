package dsa_java;

import java.util.Scanner;

public class binary_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		System.out.print("enter the no.");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				int sum=i+j;
				if (sum%2==0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
				
				
			}
			System.out.println();
		}
		
		
	}

}
