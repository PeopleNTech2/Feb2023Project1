package oops.encapsulation;

public class UseMovie {
    public static void main(String[] args) {


        Movie lordOfRings = new Movie();

//        lordOfRings.rating = "dgfrdfg";
//
//        System.out.println(lordOfRings.rating);

        lordOfRings.setRating("dbcdhb");

        System.out.println(lordOfRings.getRating());

        lordOfRings.setDuration(3);

        int a = 3;
        int total = lordOfRings.getDuration() + a;
        System.out.println(total);

    }
}
