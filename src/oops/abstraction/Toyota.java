package oops.abstraction;

public class Toyota extends ModernCar implements Car, Motor{

    public void shape() {
        System.out.println("4 doors car");
    }

    public void start() {
        System.out.println("turn the key to start");
        System.out.println("max speed is: "+maxSpeed);
    }

    public void brake() {
        System.out.println("brake to stop");
    }

    public void color(){
        System.out.println("white color");
    }

    //in order to implement an abstract method we need to use extends keyword
    public void navigation() {
        System.out.println("electric engine");
    }

    public void engine() {
        System.out.println("v8");
    }

    public void fuelType() {
        System.out.println("diesel");
    }
}
