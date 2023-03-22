package modifiers.nonaccess;

class DriveWay {
	
	int width = 10;
	int length;//=50
	
	//setter
	public void setLength(int myLength) {
			length = myLength;
	}
		
	//getter
	public int getLength() {
		return length;
	}

	public void widthOfDriveWay() {
		System.out.println("width of the driveway is: "+ width);
		System.out.println("length of the driveway is: "+length);
	}
	
	
	
	//static method can use only static attributes 
	//non static method can use both static and non static attributes 
	
	//static attribute belongs to the class 
	//non static attribute belongs to the object 
	
}
