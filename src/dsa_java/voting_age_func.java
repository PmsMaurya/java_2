/*
 * 5.Write a function that takes in age as input and returns if that person is
 * eligible to vote or not. A person of age > 18 is eligible to vote.
 */

package dsa_java;

import java.util.Scanner;

public class voting_age_func {
	public static boolean  eligible_for_vote (int age) {
		if(age>=18) {
			System.out.println("eligible");
			return true;
		}
		else {
			System.out.print("not eligible");
			return false;
		}
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter your age:");
		int age = s.nextInt();
		System.out.println(eligible_for_vote(age));
	}

}
