package dsa_java;
import java.util.*;

public class two_dim_array_insertation {

	public static void main(String[] args) {
		int row,col;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the no.of row:");
		row=s.nextInt();
	System.out.println("enter the no.of col:");
	col=s.nextInt();
	int a[][]=new int [row][col];
	System.out.println("enter the value:");
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			a[i][j]=s.nextInt();
		}
	}
	System.out.println("2D array is:");
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
	System.out.print(a[i][j]+" ");
	}
		System.out.println();
		
	}
		
	}

}
