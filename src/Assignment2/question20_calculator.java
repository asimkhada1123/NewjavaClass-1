package Assignment2;
import java.util.Scanner;
public class question20_calculator {
    public question20_calculator(int a , int b) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the operator : " );
        char operator=obj.next().charAt(0);
        switch (operator) {
            case '+' -> {
                int c = a + b;
                System.out.println("ans = " + c);
            }
            case '-' -> {
                int d = a - b;
                System.out.println("ans = " + d);
            }
            case '*' -> {
                int e = a * b;
                System.out.println("ans = " + e);
            }
            case '/' -> {
                int f = a / b;
                System.out.println("ans = " + f);
            }
            default -> System.out.println("Enter Inputs");
        }

    }
    public static void main (String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the number a : " );
        int x=obj.nextInt();
        System.out.println("Enter the number b : " );
        int y=obj.nextInt();

        new question20_calculator (x,y);

    }
}
