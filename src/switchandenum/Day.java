package switchandenum;

public class Day {

    public void task(Week day){

        switch(day){
            case MON:
                System.out.println("go school");
                break;
            case TUE:
                System.out.println("review java");
                break;
            case WED:
                System.out.println("do codelabs");
                break;
            case THU:
                System.out.println("do assignment");
                break;
            case FRI:
                System.out.println("go gym");
                break;
            case SAT:
                System.out.println("exercise java");
                break;
            case SUN:
                System.out.println("submit assigmnent");
                break;
        }
    }
}
