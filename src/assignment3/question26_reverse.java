package assignment3;
import java.util.Scanner;

public class question26_reverse {
    static int reverse(int notreverse) {
        int reverse = 0;

        while (notreverse > 0) {
            reverse = notreverse % 10 + reverse * 10;
            notreverse = notreverse / 10;
        }
        return reverse;
    }


public static void main (String[] args){
            Scanner obj= new Scanner(System.in);
            System.out.println("Enter the number: " );
            int  number =obj.nextInt();
    System.out.println("Reverse of no. is "
            + reverse(number));
        }
    }
