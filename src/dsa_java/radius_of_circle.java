package dsa_java;

import java.util.Scanner;

/* Write a function that takes in the radius as input and 
  returns the circumference of a circle.*/
public class radius_of_circle {

	public static float radius(float r) {
		float pi = (float) (3.14);
		float circumference = 2 * pi * r;
		return circumference;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("enter the the radius:");
		float r = s.nextFloat();
		System.out.println(radius(r));
	}

}
