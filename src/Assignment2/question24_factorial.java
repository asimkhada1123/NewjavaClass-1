package Assignment2;
import java.util.Scanner;
public class question24_factorial {
    public question24_factorial(int number) {
        int sum=1;
        if(number==0){
            sum=1;
        }
        else{
        for(int k=1;k<=number;k++){
            sum=sum*k;


        }}
        System.out.println("sum : "+sum);
    }
    public static void main (String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the number: " );
        int  number =obj.nextInt();
        new question24_factorial(number);

    }
}
