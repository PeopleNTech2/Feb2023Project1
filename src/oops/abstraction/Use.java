package oops.abstraction;

public class Use {
    public static void main(String[] args) {

        Toyota corolla = new Toyota();
        corolla.brake();
        corolla.start();
        corolla.shape();
        corolla.color();


        //when you create object using the interface name, you have access only to methods of the used interface
        Car camry = new Toyota();
        camry.start();
        camry.shape();
        camry.brake();

        Motor sienna = new Toyota();
        sienna.engine();
        sienna.fuelType();
        sienna.brake();

        Honda civic = new Honda();
        civic.start();
        civic.brake();
        civic.shape();

        Car accord = new Honda();

    }
}
