package assignment3;

import java.util.Scanner;
import java.util.ArrayList;
public class question28_prime_first_between {
   static  void isPrime(int number){
       boolean flag = false;
       for (int i = 2; i <= number / 2; ++i) {
           if (number % i == 0) {
               flag = true;
               break;
           }
       }

       if (!flag)
           System.out.println(number + " is a prime number.");
       else
           System.out.println(number + " is not a prime number.");

        }


    public static void main (String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the number: " );
        int  number =obj.nextInt();
        isPrime(number);
    }
}
