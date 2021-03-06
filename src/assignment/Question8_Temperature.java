package assignment;
import java.util.Scanner;

public class Question8_Temperature {
    double FtoC,CtoF;
    public Question8_Temperature(double C,double F) {
        FtoC= 1.8*C+32;
        CtoF=(F-32)*0.55;
    }
    void display(){
        System.out.println("Farenheit to Celcius is:" +FtoC+"degree C");
        System.out.println("Celcius to Farenheit  is:" +CtoF+"degree F");
        }
    public static void main (String[] args){
        double C, F;
        Scanner odj= new Scanner(System.in);

        System.out.println("Enter temperature in Celcius");
        C= odj.nextInt();
        System.out.println("Enter temperature in Farenheit");
        F= odj.nextInt();

      Question8_Temperature T= new Question8_Temperature(C,F);

        T.display();
    }
    }

