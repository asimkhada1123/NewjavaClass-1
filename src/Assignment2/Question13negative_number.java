package Assignment2;
import java.util.Scanner;
public class Question13negative_number {
    public Question13negative_number(int number) {



        if (number < 0) {
            System.out.println("the number is:   "+number);
        } else {
            System.out.println("nothing to display");
        }
    }
    public static void main (String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = obj.nextInt();
        Question13negative_number ab= new Question13negative_number(number);

    }

}