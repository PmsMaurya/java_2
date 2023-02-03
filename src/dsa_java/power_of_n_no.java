package dsa_java;

import java.util.Scanner;

/*8.Two numbers are entered by the user, x and n.Write a function to 
find the value of one number raised to the power of another i.e. .*/
public class power_of_n_no {

	public static void main(String[] args) {
		System.out.println("enter the value of x:");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();

		System.out.println("enter the value of n:");
		int n = s.nextInt();
		int result = 1;
//		while(n!=0) { 								//using while loop
//			result*=x;--n;
//		}
		for(;n!=0;--n) {             //using for loop 
			result=x*result;
		}
		System.out.println(result);
	}

}
