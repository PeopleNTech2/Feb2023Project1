package modifiers;

public class Calculator {

	// properties
	// variables
	private int a = 5;
	int b = 1;

	public Calculator(){
		
	}
	
	// methods
	// non-return
	void sum(int x, int y) {
		// implement
		int total = x + y;
		System.out.println(total);
	}

	// return
	int sub(int x, int y) {
		int total = x - y;
		return total;
	}

	double pi = 3.14;

	// class assignment
	// circle perimeter
	public void perimeter(double radius) {
		double perimeter = 2 * pi * radius;
		System.out.println("perimeter of a radius " + radius + " circle is: " + perimeter);
	}

	// circle area
	private double area(double radius) {
		double area = pi * (radius * radius);
		return area;
	}
}
