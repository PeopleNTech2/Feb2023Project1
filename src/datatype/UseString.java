package datatype;

public class UseString {
	public static void main(String[] args) {
		
		//chain of characters or null
		String str1 = "Hello";//olleH
		String str2 = "World";
		String str3 = "turn this text into camel case";
		
		//string concatenation 
		System.out.println(str1+" "+str2);
		System.out.println(123+str1);
		
		//string manipulation 
		System.out.println(str1.concat(str2));
		System.out.println(str1.length());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.charAt(4));
		System.out.println(str1.replace("l", "w"));
		
	}
}
