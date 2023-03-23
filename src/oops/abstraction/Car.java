package oops.abstraction;

public interface Car {

    //variables in interface is final by default
    final int maxSpeed = 160;

    //abstract methods has no body
    //methods in interface are public by default
    public void shape();

    public void start();

    public void brake();
}
