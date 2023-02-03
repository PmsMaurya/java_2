package dsa_java;
import java.util.*;
public class odd_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
        System.out.println("enter the no.:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=1;i<=n;i++) {
        	if(i%2==0) {
        		System.out.println("even no.");
        	}
        	else {
        		System.out.println("odd no.");
        	}
        	System.out.println(i);
        }
	}

}
