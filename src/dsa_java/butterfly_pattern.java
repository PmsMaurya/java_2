package dsa_java;
import java.util.*;

public class butterfly_pattern {

	public static void main(String[] args) {
		 
   int n;                                          // upper loop 
     System.out.print("enter the no. of row and col:");
    Scanner s= new Scanner(System.in);
    n=s.nextInt();
  
    for(int i=1;i<=n;i++) {
    	for(int j=1;j<=i;j++) {
    		System.out.print("*");
    	}
    	for(int  j=1;j<=2*(n-i);j++) {
    		System.out.print(" ");
    	}
    	for(int j=1;j<=i;j++) {
    		System.out.print("*");
    	}
    	System.out.println();
    }
                             // lower loop only change condition int i;
    for(int i=n;i>=1;i--) {
    	for(int j=1;j<=i;j++) {
    		System.out.print("*");
    		
    	}
    	 int  space =2*(n-i);
    	 
    		for(int  j=1;j<=2*(n-i);j++) {
        		System.out.print(" ");
        	}
    		for(int j=1;j<=i;j++) {
    			System.out.print("*");
    		}
    	System.out.println();
    }
	}

}
