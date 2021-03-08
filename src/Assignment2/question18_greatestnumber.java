package Assignment2;
import java.util.Scanner;
public class question18_greatestnumber {
    public question18_greatestnumber(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("a is largest number ");

        } else if (b > a && b > c) {System.out.println("b is largest number");
        }
        else
        {
            System.out.println("c is largest");
        }
    }

    public static void main (String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the number a : " );
        int x=obj.nextInt();
        System.out.println("Enter the number b : " );
        int y=obj.nextInt();
        System.out.println("Enter the number c: " );
        int z=obj.nextInt();
        new question18_greatestnumber(x,y,z);

    }
}