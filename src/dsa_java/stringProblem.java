package dsa_java;

import java.util.Scanner;

public class stringProblem {
	/*
	 * Take an array of Strings input from the user & find the cumulative
	 * (combined) length of all those strings.
	 */
	public void find_length_stringArray() {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the no.of array:");
		int size=sc.nextInt();           
		String a[]=new String [size];   
		int totLength=0;
		for(int i=0;i<size;i++) {
			a[i]=sc.next();
			totLength+=a[i].length();
		}
		System.out.println( "length of array a[i] is: "+ totLength);
		System.out.println("**************************");
	}
	public void change_char() {
		System.out.print("enter the stirngs:");
		Scanner sc= new Scanner(System.in);
		 String string1=sc.next();
		 String result=" ";          // replace 'e'  =='i' in string;
		 for(int j=0;j<string1.length();j++) {
			 if(string1.charAt(j)=='e') {
				 result +='i';
			 }
			 else {
				 result+=string1.charAt(j);
			 }
		 }
		 System.out.println(result);
	}
	public void limited_sentence_print() {
		System.out.print("enter the stirngs:");
		Scanner sc= new Scanner(System.in);
		 String string1=sc.next();
		 String email="";          // limit area print in string;
		 for(int j=0;j<string1.length();j++) {
			 if(string1.charAt(j)=='@') {
				break;
			 }
			 else {
				 email+=string1.charAt(j);
			 }
		 }
		 System.out.println(email);
	}
	
	public static void main(String[] args) {
		stringProblem pm=new stringProblem();//create object
		pm.find_length_stringArray();
		pm.change_char();
		pm.limited_sentence_print();
	}

}
