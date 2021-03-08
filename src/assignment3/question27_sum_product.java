package assignment3;
import java.util.Scanner;
public class question27_sum_product {
    static void sum_product(int number) {
        int Sum=0;
        int multiplier=0;
        int units=number%10;
        int tens=(number/10)%10;
        int hundreds=(number/10)/10;
        Sum= units + tens + hundreds;
        multiplier= units*tens*hundreds;
        System.out.println("Sum is "+Sum);
        System.out.println("multiplier is "+multiplier);

    }

    public static void main (String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the number: " );
        int  number =obj.nextInt();
        sum_product(number);
    }

}
