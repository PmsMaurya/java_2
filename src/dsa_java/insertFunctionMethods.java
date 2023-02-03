package dsa_java;
              //methods and functions
import java.util.Scanner;

public class insertFunctionMethods {
	public static int Product(int a,int b) {
		
		return a*b;
		
	}
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the first no.");
		int a=sc.nextInt();
		System.out.println("enter the Second no.");
		int b=sc.nextInt();
		
		System.out.println("Product is: "+Product(a,b)); 
	}
}
       