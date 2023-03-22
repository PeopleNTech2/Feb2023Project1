package oops.inheritance;

public class Use {
    public static void main(String[] args) {

        GrandFather brooklyn = new GrandFather();
        brooklyn.hasMoney();

        Father john = new Father();
        john.hasCar();
        john.hasMoney();

        Mother fatima = new Mother();
        fatima.billionaire();

        Son david = new Son();
        david.hasCar();
        david.hasMoney();

    }
}
