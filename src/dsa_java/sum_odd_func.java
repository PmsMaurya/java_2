package dsa_java;

import java.util.Scanner;

/*Write a function to print the sum of all 
   odd numbers from 1 to n.*/
public class sum_odd_func {
	public static void sum(int n) {
		int p = 0;
		for (int i = 1; i <= n; i++) {

			if (i % 2 == 1) {
				p = p + i;
			}
		}
		System.out.println(p + " <--total sum.");
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("enter the no.");
		int n = s.nextInt();
		int i;
		sum(n);

	}

}
