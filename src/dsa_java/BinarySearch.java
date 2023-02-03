package dsa_java;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         int a[]= {8,9,5,6,4,7,3,2,10};
         for(int i=0;i<=a.length;i++) {
        	 //a[i]=sc.nextInt();
        	 System.out.print(a);
        	
         }
      System.out.print("enter the no.to search:");
      int key=7;
      int i=0,j=a.length-1;
     int  flag=0;
     int pos = 0;
     while(i<=j&&flag==0) {
    	 int mid=(i+j)/2;
    	 if(a[mid]==key) {
    		 flag=1;
    		  pos=mid+1;
    		 
    	 }
    	 if(a[mid]<key)
    		 i=mid+1;
    	 if(a[mid]>key)
    		 j=mid-1;
    	 if(flag==0) {
    		 System.out.println("not found");
    	 }
    	 else 
    		 System.out.println("found"+pos);
    	 
     }
      
	}

}
