package dsa_java;

import java.util.*;

/*Enter 3 numbers from the user 
& make a function to print their average.*/
public class average_function {
	public static int average(int a, int b, int c) {
		int average;
		average = (a + b + c) / 3;
		return average;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		System.out.println(" " + average(a, b, c));

	}

}
