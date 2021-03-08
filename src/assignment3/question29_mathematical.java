package assignment3;

import java.util.Scanner;
public class question29_mathematical {
    public question29_mathematical(int number) {
        double sum=1;
        double sum_2=0;
        double sum_3=0;
        if(number==0){
            sum=1;
        }
        else{
            for(int k=1;k<=number;k++){
                sum=sum*k;
                sum_2=sum_2+(k/sum);
            }
        }
        sum_3=sum_2;
        System.out.println("sum : " +sum_3);
    }
    public static void main (String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the number: " );
        int  number =obj.nextInt();
        new question29_mathematical(number);

    }
}
