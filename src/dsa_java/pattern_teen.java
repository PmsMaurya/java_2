package dsa_java;
import java.util.*;
public class pattern_teen{

	public static void main(String[] args) {

		int n;
		System.out.print("enter the no.of row and col:");
         Scanner s=new Scanner(System.in);
         n=s.nextInt();
       
         for(int i=n;i>=1;i--) {
        	 for(int j=1;j<=i;j++) {
        		 System.out.print(" ");
        	 }
        	 for(int j=1;j<=n;j++) {
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
        
         
	}

}
