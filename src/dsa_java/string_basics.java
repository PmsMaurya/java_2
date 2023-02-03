package dsa_java;
       // java string are immutable;
public class string_basics {
	public void lower_case() {
		 String name1 = "PRIYANSHU MAURYA";
		System.out.println(name1.toLowerCase());    // change in lower case;
		System.out.println("**************************");
		
		 System.out.println(name1.length());    // length of letters in name;
		 System.out.println("**************************");
		 
		 for(int i=0;i<name1.length();i++) {      //to print the string letters;
			 System.out.println(name1.charAt(i));
		 }
		 System.out.println("**************************");
		 
		System.out.println(name1.trim());            // remove whitespace from both ends of a string;
		System.out.println("**************************");
		
		String name2=name1.concat(" PMS");         //concat use for add two sentences;
		System.out.println(name2);
		System.out.println("**************************");
	}

	public void upper_case() {
		String name3 = "ashutosh chauhan";
		System.out.println(name3.toUpperCase());    // change in upper case;
		System.out.println("**************************");
		
		System.out.println(name3.length());
		System.out.println("**************************");
		
		System.out.println(name3.toString());  // returns the value of a string object;
		System.out.println("**************************");
	}
	// for comparing two string  ,equal or not;
	public void string_compare() {
		String name4="Priyanshu Maurya";      // compare according to alphabet numbers;
		String name5="Priyanshu Maurya";      // hello < less than wello;
		if(name4.compareTo(name5)==0) {
			System.out.println("string are equal:");
		}
		else {
			System.out.println("string are not equal.");
		}
		System.out.println("**************************");
	}
	public void substring() {// substring start
		String name6="Divyanshu Maurya";
		String sentence=name6.substring(4,name6.length()); //we want to print only "anshu Maurya";
		System.out.println(sentence);
		System.out.println("**************************");
		
		String sentence1=name6.substring(4,8);    //we want to print "ansh";
		System.out.println(sentence1);
		System.out.println("**************************");
	}
	
	
	public void string_to_integer() {
		String name="126546";
		 int number=Integer.parseInt(name);// method for string to integer output;
		System.out.println(name);
		System.out.println("**************************");	
	}
	public void integer_to_string() {
		int  num= 126546;
		 String str =Integer.toString(num);// method for integer  to string length output;
		System.out.println(str.length());}

	public static void main(String[] args) {
		string_basics pm = new string_basics();
		pm.lower_case();    // create object for all class run;
		pm.upper_case();
		pm.string_compare();
		pm.substring();
		pm.string_to_integer();
		pm.integer_to_string();
	}
}
