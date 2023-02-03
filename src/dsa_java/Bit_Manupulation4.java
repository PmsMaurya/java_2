package dsa_java;
 import java.util.*;
/*Program name :'update bit';
  Problem:-update the 2nd bit(position=1)Of a number n to 1;(n=0101);
 (i)bitMask=1<<i; //0 banane ke liye                     (ii)bitMask=1<<i;    //1 banane ke liye  
 (i)operation:'and'with'not';                            (ii)Operation:'OR';
*/
public class Bit_Manupulation4 {
	public static void main(String[]args) {
      int n=5;
      int position=1;
      System.out.print("enter the opertions 1 ys 0 :");
      Scanner sc=new Scanner(System.in);
       int operation=sc.nextInt();
      //operation=1;matlab use 'set bit';and operation=0,matlab use 'clear set'
      int bitMask= 1<<position;
      if(operation==1) {
    	  int newNumber = bitMask|n;    //set bit use
    	  System.out.println(newNumber);
      }
      else {
    	  int newNumber=(~(bitMask)&n);
    	  System.out.println(newNumber);
}
}}