package dsa_java;

public class PMS_patern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||j==1||j==n||i==n) {
				System.out.print("@");}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			//1.tri m
			for(int j=1;j<=i;j++) {
				if(i==1||j==1||i==j||j==i) {
					System.out.print("@");}
					else {
						System.out.print(" ");
					}
			}
			//2
			for(int j=i;j<=n-1;j++) {
				System.out.print(" ");
			}
			//3
			for(int j=i;j<=n-1;j++) {
				System.out.print(" ");
			}
			//4
			for(int j=1;j<=i;j++) {
				if(i==1||j==1||i==j||j==i) {
					System.out.print("@");}
					else {
						System.out.print(" ");
					}
			}
			System.out.print("   ");
			for(int j=1;j<=n;j++) {
				if(i==1||j==1||i==n) {
					System.out.print("@");}
					else {
						System.out.print(" ");
					}
				
			}
			System.out.println();
		}
		//lower part
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1) {
					System.out.print("@");}
					else {
						System.out.print(" ");
					}
		}
			System.out.print("   ");
			for(int j=1;j<=n;j++) {
				if(j==1) {
					System.out.print("@");}
					else {
						System.out.print(" ");
					}
			}
			
			for(int j=1;j<=n;j++) {
				if(j==n) {
					System.out.print("@");}
					else {
						System.out.print(" ");
					}
			}
			System.out.print("   ");
			for(int j=1;j<=n;j++) {
				if(j==n||i==n) {
					System.out.print("@");}
					else {
						System.out.print(" ");
					}
			}
			System.out.println();
			}
	}

}
