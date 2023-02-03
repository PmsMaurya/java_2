package dsa_java;

import java.util.*;

public class floyds_count_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int number = 1;
		System.out.print("enter the no.");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}
	}
}