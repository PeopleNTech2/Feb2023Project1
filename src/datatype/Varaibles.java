package datatype;

public class Varaibles {
	public static void main(String[] args) {
		//primitive variable
				//instance variable
				
				//variables
					//number 
						//whole number
						byte b = 125;//1 byte  -128/127
						short s = 12544;//2 bytes -32000/+32000
						int maxSpeed = 154853;//4 bytes -2147000000/+2147000000
						long l = 524962156168161L;//8 bytes -2e1074/(2-2)e-52 2e1023
				
						//fraction 
						float f = 1.12545F;//4 bytes 6 to 7 decimal
						double d = 1.2545469654654;//8 bytes 15 decimal digits
						
					//character 
					char ch = '*';//2 bytes
					
					//true or false value
					boolean flag = true;//1/4 byte (1 bit)
					
					//variable declaration 
					int num;
					
					//variable assignment 
					num = 1234;
					System.out.println(num);
					
					//variable reassignment 
					num = 25487;
					System.out.println(num);
					
					//thisIsCamelCase
					
					//final make the variable immutable 
					final int age = 20;
					
					//string concatenation 
					System.out.println(5+9+"3");
					
					System.out.println(5 != 3);
					
					System.out.println("HELLO");//"Hi!"
					System.out.print(5+"\n \n \n");
					System.out.println("\\\\Hi!\\");
					
					System.out.println("\"Hi!\"");
					
					/**
					 \' single quote
					 \" double quote
					 \\ backslash
					 \n new line
					 \t tab
					 \r back to beginning of the line
					 \b backspace
					 \f next page
					 */
	}
}
