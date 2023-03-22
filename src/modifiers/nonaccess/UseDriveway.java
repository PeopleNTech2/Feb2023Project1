package modifiers.nonaccess;

public class UseDriveway {
	public static void main(String[] args) {
		
		DriveWay myDriveWay = new DriveWay();
		
		myDriveWay.setLength(50);
		System.out.println("my driveway is: "+myDriveWay.getLength());//50
		
		DriveWay neighborDriveWay = new DriveWay();
		
		neighborDriveWay.setLength(20);
		System.out.println("my meighbor's driveway is: "+neighborDriveWay.getLength());//20
		
		System.out.println("my driveway is: "+myDriveWay.getLength());//50
		
		DriveWay neighbor2DriveWay = new DriveWay();
		
		neighbor2DriveWay.setLength(100);
		System.out.println("my neighbor 2 driveway is: "+neighbor2DriveWay.getLength());//100
		
		System.out.println("my meighbor's driveway is: "+neighborDriveWay.getLength());//20
		
		System.out.println("my driveway is: "+myDriveWay.getLength());//50

	}
}
