package dsa_java;
//Program name 'Clear bit';
public class Bit_Manupulation3 {
//Problem:clear the 3rd bit(position=2) of a number n.(n==0101)
//          bitMask:1<<i;       //matalb 3rd bit ko 1 se 0 kerna hai;
//          Operation:'and'with 'Not';
	public static void main(String[] args) {
		int n=5;
		int position=2;
		int bitMask=1<<2;
		int answer=(~(bitMask)&n);
		
System.out.println(answer);
	}

}
