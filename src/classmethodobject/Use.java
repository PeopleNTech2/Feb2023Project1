package classmethodobject;

public class Use {

	
	public static void main(String[] args) {
		
		House whiteHouse = new House();//object of a class
		System.out.println(whiteHouse.numberOfRooms);//we use the object to access House properties
		System.out.println(whiteHouse.color);
		
		whiteHouse.kitchen();
		
		//print return method
		System.out.println(whiteHouse.bedroom());
		
		//we cannot print non return method
		//System.out.println(whiteHouse.kitchen());
		
		Calculator cal = new Calculator(); 
		cal.sum(2548651, 846565);
		
//		System.out.println(cal.sub());
		
		Circle circle = new Circle();
		circle.perimeter(7.5);
		
//		System.out.println("area of a 7.5 radius circle is: "+circle.area(7.5));


	}

}
