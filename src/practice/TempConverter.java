package practice;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mode;
        int convertedTemp;
        int tempTOConvert;
        int answer = 0;

        System.out.println("-----------------------------WELCOME-----------------------------");
        System.out.println("-----------------------to temp converter-------------------------");

        do {
            System.out.println("choose the conversion mode:");
            System.out.println("1- C to F");
            System.out.println("2- F to C");

            mode = sc.nextInt();

            if (mode == 1){
                System.out.println("enter the temp to convert in C");
                tempTOConvert = sc.nextInt();
                convertedTemp = (tempTOConvert * 9/5) + 32;
                System.out.println(tempTOConvert+" C = "+convertedTemp+" F");
            }else if (mode == 2){
                System.out.println("enter the temp to convert in F");
                tempTOConvert = sc.nextInt();
                convertedTemp = (tempTOConvert - 32) * 5/9;
                System.out.println(tempTOConvert+" F = "+convertedTemp+" C");
            }

            System.out.println("do you want to convert another temp?");
            System.out.println("1- yes");
            System.out.println("2- no");
            answer = sc.nextInt();
        }while (answer == 1);

        System.out.println("goodbye, see you soon!!!");

    }
}
