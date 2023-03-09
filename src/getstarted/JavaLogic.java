package getstarted;

public class JavaLogic {

	public static void main(String[] args) {
		int age = 20;
		int numberOfStudents = 35;
		
		//string concatenation 
		System.out.println(5+9+"3");
		
		System.out.println(5 != 3);
		
		//operators in java
			//assignment: =
			String name = "John";
			//arithmetic: +, -, /, *, %, ++, --
			System.out.println(3+3);//6
			System.out.println(3-3);//0
			System.out.println(10/3);//3
			System.out.println(10*3);//30
			System.out.println(10%3);//1
			System.out.println(age);//20
			System.out.println(age++);//20
			System.out.println(age);//21
			System.out.println(++age);//22
			System.out.println(age);//22
			System.out.println(numberOfStudents);
			System.out.println(numberOfStudents--);
			System.out.println(numberOfStudents);
			System.out.println(--numberOfStudents);
			
			//comparison: ==, !=, >, >=, <, <=
			System.out.println(10 == 10);
			System.out.println(10 != 10);
			System.out.println(5 > 4);
			System.out.println(5 >= 4);
			System.out.println(0 < -5);
			System.out.println(0 <= 5);
			
			//logical: &&, ||, !
			System.out.println(10 > 5 && 10 < 15);//true
			System.out.println(10 < 5 && 10 < 15);//false
			System.out.println(7 == 8 || 7 == 7);//true
			System.out.println(!(7>10));//false
		
		
		

	}

}
