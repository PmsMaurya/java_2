package dsa_java;

import java.util.Scanner;

public class linear_search_twoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of row:");
		int row=sc.nextInt();
		System.out.println("enter the no. of col:");
		int col=sc.nextInt();
		int a[][]=new int [row][col];
		System.out.print("enter the array elements:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.print("enter element for find position:");
		
		
		int x=sc.nextInt();
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(a[i][j]==x) {
					System.out.print("Array index position is:"+i+","+j);
					
				}
				
			}
			

	}
	

}}
