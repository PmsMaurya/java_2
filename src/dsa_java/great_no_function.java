package dsa_java;

import java.util.Scanner;

/*Write a function which takes in 2 numbers and 
returns the greater of those two.*/
public class great_no_function {
	public static int greater(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("enter the 1st no.:");
		int a = s.nextInt();
		System.out.print("enter the 2nd no.:");
		int b = s.nextInt();
		System.out.println("greater value is: " + greater(a, b));

	}

}
