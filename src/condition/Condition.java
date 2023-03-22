package condition;

import classmethodobject.House;
import modifiers.access.Calculator;

public class Condition {

	public static void main(String[] args) {
		int a = -5;
		
		if(a > 0) {
			System.out.println("this number is positive");
		}
		
		if(a > 0) {
			System.out.println("this number is positive");
		}else if(a < 0){
			System.out.println("this number is negative");
		}
		
		if(a > 0) {
			System.out.println("this number is positive");
		}else {
			System.out.println("this number is 0");
		}
		
		if(a > 0) {
			System.out.println("this number is positive");
		}else if(a < 0){
			System.out.println("this number is negative");
		}else {
			System.out.println("this number is 0");
		}
		
		Calculator cal = new Calculator();
		cal.sum(10, 10);
		
		House house = new House();
		house.bedroom();
	
	}

}
