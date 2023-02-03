package dsa_java;

import java.io.*;

public class bufferReader {

	public static void main(String[] args) throws NumberFormatException, IOException
 {
           int a,b,sum;
           BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
           System.out.println("enter the first number:");
           a=Integer.parseInt(br.readLine());
           System.out.println("enter the second number:");
           b=Integer.parseInt(br.readLine());
           sum=a+b;
           System.out.println("addition:"+sum);
		
	}

}
