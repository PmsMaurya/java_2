package dsa_java;

public class Bit_Manupulation2 {
	// Program name is 'set bit';
   //    	Problem: set the 2nd bit (position=1) of a number n.(n=0101).
  //	    BitMask :1<<i;
 //	    Operation:OR;
	public static void main(String[] args) {
		int n = 5;
		int position = 1; // (0101)|(0010)=0111
		int bitMask = 1 << position;
		int newNumber = bitMask | n;
		System.out.println(newNumber);

	}

}
