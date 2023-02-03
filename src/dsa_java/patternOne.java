package dsa_java;
import java.util.*;

public class patternOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n;
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 for(int i=1;i<=n-2;i++) {
	 for(int j=1;j<=n;j++) {
		 System.out.print("*");
	 }
	 System.out.println();
 }
	}
	
}
