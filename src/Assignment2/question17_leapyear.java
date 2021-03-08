package Assignment2;

import javax.swing.*;
import java.util.Scanner;

public class question17_leapyear {
    public question17_leapyear(int a) {
boolean leap=false;
        if (a % 4 == 0) {
            if(a%100==0){
                if(a%400==0){
                    leap=true;

                }
                else
                    leap=false;
            }
            else
                leap=true;
        }
            else
                leap=false;
        if (leap)
            System.out.println(a + " is a leap year.");
        else
            System.out.println(a + " is not a leap year.");
    }

    public static void main (String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the number a : " );
        int a=obj.nextInt();


        question17_leapyear cc = new question17_leapyear(a);



    }
}
