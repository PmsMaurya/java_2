package dsa_java;

public class Bit_Manupulation1 {
   //Program name is 'get bit'
	
	public static void main(String[] args) {
		int a=5;
		int pos=2;
			//inter(num)<<position no./jitna bit humye shift kerna hai;
		int bitMask=1<<pos;    // '1'left shift hoga  2 time(_ _ 1) =0100=bitMask;
		                       //'AND'gate perform b/w  (a & bitMask)(0101&0100=0100)
		if((bitMask&a)==0) {
			System.out.println("bit was zero.");
		}
		else {
			System.out.println("bit was non zero.");
		}

	}
//final answer is 0100 ,output is non zero;
}
