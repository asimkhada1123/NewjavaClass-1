package Assignment2;
import java.util.Scanner;
public class question23_sumnth {
    public question23_sumnth( int number) {
        int sum=0;
        for(int k=1;k<=number;k++){
             sum=sum+k;


        }
        System.out.println("sum : "+sum);
    }
    public static void main (String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the number: " );
        int  number =obj.nextInt();
        new question23_sumnth(number);

    }
}
