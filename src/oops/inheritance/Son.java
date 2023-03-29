package oops.inheritance;

public class Son extends Father{

    Son(){
        super(7);
    }

    public void hasCar(){
        super.hasCar();
        super.numberOfSport = 8;
    }
}
