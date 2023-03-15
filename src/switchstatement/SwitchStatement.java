package switchstatement;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		
		String day;
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the day");
		day = sc.nextLine();
		
		switch(day){
		case "Mon": 
			System.out.println("go school");
			break;
		case "Tue": 
			System.out.println("review java");
			break;
		case "Wed": 
			System.out.println("do codelabs");
			break;
		case "Thu": 
			System.out.println("do assignment");
			break;
		case "Fri": 
			System.out.println("go gym");
			break;
		case "Sat": 
			System.out.println("practice java");
			break;
		case "Sun": 
			System.out.println("submit assigmnent");
			break;
		default:
			System.out.println("invalid day");
		}

	}

}
