package dsa_java;

public class String_builder {

	public static void main(String[] args) {
	
      //1.declaration
		StringBuilder sb=new StringBuilder("Priyanshu");
		System.out.println(sb);
		
		//2. print charAt index
		System.out.println(sb.charAt(4));
		
		//3. Replace or set a character at index
		sb.setCharAt(0,'H');
		System.out.println(sb);
		
		
		//4. Insert/ add character at some index
		sb.insert(9, 'i');
		System.out.println(sb);
		
		//5.Delete  character at index string
		sb.delete(9,'i');
		System.out.println(sb);
		
		// 6.Replace or set a character at index
				sb.setCharAt(0,'P');
				System.out.println(sb);
				
	//  7. append a char
				sb.append(" Maurya");
				sb.append('a');
				System.out.println(sb);
				
	// 8.length of stringbuilder
				System.out.println(sb.length());
	}

}
