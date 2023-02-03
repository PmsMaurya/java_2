package dsa_java;
import java.util.*;

public class hollowPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
System.out.print("enter the no.");
Scanner s=new Scanner(System.in);
 n=s.nextInt();
 for(int i=1;i<=n;i++) {
	 for(int j=1;j<=n;j++) {
		 if(i==1||j==1||i==n||j==n) {
			 System.out.print("*");
		 }
		 else {
			 System.out.print(" ");
		 }
	 }
	 System.out.println();
 }
	}

}
