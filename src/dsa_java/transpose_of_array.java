package dsa_java;

import java.util.Scanner;

public class transpose_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of row:");
		int row=sc.nextInt();
		System.out.println("enter the no. of col:");
		int col=sc.nextInt();
		int a[][]=new int [row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
			
			
		}
		//transpose condition
			for(int j=0;j<col;j++) {
				for(int i=0;i<row;i++) {
				
					System.out.print(a[i][j]+" ");
				
				
			}
				System.out.println();
			

	}
	}

}
