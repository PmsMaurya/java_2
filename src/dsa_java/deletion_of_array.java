package dsa_java;
import java.util.*;
public class deletion_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int o,n,m;
    Scanner s= new Scanner(System.in);
    System.out.println("enter the no.of array:");
    n=s.nextInt();
    int a[]=new int [n];
    int b[]=new int [n-1];
    for(int i=0;i<n;i++) {
    	a[i]=s.nextInt();
    }
    System.out.println(a[1]);
    m=s.nextInt();
    for(int i=0;i<a.length;i++) {
    	if(i<m) {
    		b[i]=a[i];}
    		else if(i==m) {
    			continue;
    		}
    		else {
    			b[i-1]=a[i];
    		}
    	}
    System.out.println("elements are:");
    for(int  i=0;i<n-1;i++) {
    	System.out.println(b[i]);
    	}
     
    }
	}


