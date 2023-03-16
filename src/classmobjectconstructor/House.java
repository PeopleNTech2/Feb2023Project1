package classmobjectconstructor;

public class House {
	//variables
	int numberOfRooms;
	String color = "white";
	
	//default constructor
	House(){
		
	}
	
	//built constructor
	House(int myNumberOfRooms){
		numberOfRooms = myNumberOfRooms;
	}
	
	House(String myColor){
		color = myColor;
	}
	
	House(int myNumberOfRooms, String myColor){
		numberOfRooms = myNumberOfRooms;
		color = myColor;
	}
	
	//methods
	void room() {
		System.out.println("zzzzzzzzzzzzzzzzz");
		System.out.println("number of rooms "+numberOfRooms);
	}
	
	void kitchen() {
		System.out.println("yummy");
	}
	
	void bathroom() {
		System.out.println("lalalala");
		System.out.println("bathroom color is: "+color);
	}

}
