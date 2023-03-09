package datatype;

public class Casting {

	public static void main(String[] args) {

		//byte - short - char - int - long - float - double
		//java takes care of up-casting (widening)
		int a = 10;
		
		int b = 3;
		
		double c = a / b;//3 1
		
		System.out.println(c);
		
		//down-casting should be done manually (narrowing)
		double d = 10;
		
		double f = 3;
		
		int g = (int) (d / f);//3 1
		
		System.out.println(g);
		
		
		
		int z = 1;
		double x = z;
		System.out.println("value of x = "+x);

		
		double h = 1.25;
		int y = (int) h;
		System.out.println("value of y = "+y);
		
	}

}
