package dsa_java;

import java.util.Scanner;

public class check_prime_number {

	public static void main(String[] args) {
		int n, count=0,i=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the no.:");
		n=sc.nextInt();
		while(i<=n) {
			if(n%i==0) 
				count=count+1;
				
			
			i=i+1;}
			if(count==2) {
				System.out.println(n+" "+"is prime no.");
			}
			else {
				System.out.println(n+" "+"is not prime no.");
			}
		

	}

}
