package classmobjectconstructor;

import java.util.Scanner;

public class UseHouse {
	
	public static void main(String[] args) {
		
		//constructor is a piece of code similar to method called implicitly during the creation of the object 
		House myHouse = new House();
		
		myHouse.room();
		
		myHouse.kitchen();
		
		myHouse.bathroom();
		
		House yourHouse = new House(10);
		
		yourHouse.room();
		
		House hisHouse = new House("red");
		
		House herHouse = new House(20, "pink");
		herHouse.bathroom();
	}

}
