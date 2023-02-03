package dsa_java;

public class reverse_string {
    
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("priyanshu");
		for(int i=0;i<sb.length()/2;i++) {
			int front= i;
			int back=sb.length()-1-i;         //9-1-0= 8
			char frontchar=sb.charAt(front);
			char backchar=sb.charAt(back);
			
			sb.setCharAt(front,backchar);
			sb.setCharAt(back, frontchar);
		}
		System.out.println(sb);

	}

}
