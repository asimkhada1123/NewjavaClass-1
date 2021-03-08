package Assignment2;

import java.util.Scanner;

public class question21daysofweek {
    public question21daysofweek(int daynumber) {

        switch (daynumber) {
            case 1 ->
                System.out.println("day is sunday");


            case 2 ->

                System.out.println("day is monday");

            case 3 ->

                System.out.println("day is tuesday");

            case 4 ->

                System.out.println("day is wednesday");

            case 5 ->

                System.out.println("day is thursday");

            case 6 ->

                System.out.println("day is friday");

            case 7 ->

                System.out.println("day is saturday");

            default -> System.out.println(" you  are in mars");
        }
    }
    public static void main (String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the day number: " );
        int  daynumber =obj.nextInt();

        new question21daysofweek (daynumber);

    }
}
