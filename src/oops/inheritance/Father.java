package oops.inheritance;

public class Father extends GrandFather{

    int numberOfSport = 5;

    Father(int numberOfSport){
        this.numberOfSport = numberOfSport;
    }
    protected void hasCar(){
        System.out.println("has car");
    }
}
