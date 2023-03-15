package classmethodobject;

public class House {//class is a blueprint
	
	//class properties
	//variables
	int numberOfRooms = 5;
	String color = "white";
	
	//methods
	//non return method
	void kitchen() {
		System.out.println("yummy yummy");
	}
	//return method
	String bathroom = "value";
	String bathroom() {
		return "value";
	}
	int bedroom() {
		int numOfRooms = 3;
		int numberOfKitchen = 2;
		int numberOfBathRooms = 2;
		int totalOfRoom = numOfRooms + numberOfKitchen + numberOfBathRooms;
		return totalOfRoom;
	}
	double livingroom() {
		return 1.2548653564;
	}
	byte room1() {
		return 124;
	}
	short room2() {
		return 15448;
	}
	long room3() {
		return 5216413516132L;
	}
	float room4() {
		return 1.2561584F;
	}
	char room5() {
		return '&';
	}
	boolean room6() {
		return true;
	}
}
