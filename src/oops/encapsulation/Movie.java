package oops.encapsulation;

public class Movie {

    //global variable is a variable that belongs to the class
    //P PG PG-13 R
    private String rating;
    private int duration;

    public String getRating() {
        if (rating != "P" && rating != "PG" && rating != "PG-13" && rating != "R"){
            rating = "NR";
            return rating;
        }else {
            return rating;
        }
//        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    //"this" keyword makes reference to the global variable
    public void setDuration(int duration) {
        //local is a variable that belongs to method
        this.duration = duration;
    }
}
