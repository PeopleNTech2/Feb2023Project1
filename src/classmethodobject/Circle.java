package classmethodobject;

public class Circle {
	
	double pi = 3.14;
	double r = 7.5;
	
	void perimeter(double radius) {
		double per = radius * pi * 2;
		System.out.println("perimeter of a "+radius+" circle is: "+ per);
	}
	
	double area(double radius) {
		double are = pi * (radius * radius);
		return are;
	}
	
	//recursion: is when a method calls itself
	
}
