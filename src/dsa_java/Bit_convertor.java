package dsa_java;

import java.util.Scanner;

public class Bit_convertor {
	public  void setbit( ){

	int n=8;// isko binary me set kerke 10 bnana hai;
	int position=1;
	int bitMask=1<<position;
	int newNumber= bitMask|n;
	System.out.println(newNumber);}
	
	public void clear_del_bit() {
		int n=15;// isko binary me bit clear  kerke 11 bnana hai;
		int pos=2;
		int bitmask=1<<pos;
		int newbitmask=~(bitmask);
		int newnumber=newbitmask&n;
		System.out.println(newnumber);
	}
	public void update_change_bit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the operations:0&1 kisme convert kerna hai:");
		int oper=sc.nextInt();
		int n=20;
		int pos=2;        //jis bit ko update kerna uska position;
		int bitMask=1<<pos;         
		if(oper==1) {
			int newbit=bitMask|n; // 1 me change ke liye;
			System.out.println(newbit);
		}
		else {
			int newbit=(~bitMask&n); // 0 me change ke liye;
			System.out.println(newbit);
		}
	}
	public static void main(String[] args) {
		Bit_convertor s=new Bit_convertor ();
		s.setbit();
		s.clear_del_bit();
		s.update_change_bit();
	}
	
}
	
