package classmethodobject;

public class UseHouse {

	
	public static void main(String[] args) {
		
		House whiteHouse = new House();//object of a class
		System.out.println(whiteHouse.numberOfRooms);//we use the object to access House properties
		System.out.println(whiteHouse.color);
		
		whiteHouse.kitchen();
		
		System.out.println(whiteHouse.bedroom());


	}

}
