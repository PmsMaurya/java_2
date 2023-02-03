package dsa_java;

import java.util.Scanner;

class A{
	int a,b;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		System.out.println("Enter the value of b:");
		b=sc.nextInt();
	}
	void operation() {
		int add=a+b;
		System.out.println("addition :"+add);
	}
}
class B extends A{               // use  inheritence 
	int c;
	void input1() {
		Scanner s=new Scanner(System.in) ;
		System.out.println("enter the value of c:");
		c=s.nextInt();
	}
		
		void display1() {
			int sum=a+b+c;
			System.out.println("Total addition is:"+sum);
		}
}
public class Single_Inheritence {

	public static void main(String[] args) {
B aa=new B();
aa.input();
aa.operation();
aa.input1();

aa.display1();


	}

}
