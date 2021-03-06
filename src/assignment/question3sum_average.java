package assignment;
import java.util.Scanner;
public class question3sum_average {

    public static void main (String[] args){
 //variable declaration
        int a,b,sum;
        float average;
  //Scanning or taking input
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first number :");
        a=obj.nextInt();
        System.out.println("Enter the second number :");
        b=obj.nextInt();
 //calculating sum and average
        sum=a+b;
        average=(float)((a+b)/2);
        System.out.println("Sum is :"+ sum);
        System.out.println("Average is :"+average);


    }
}