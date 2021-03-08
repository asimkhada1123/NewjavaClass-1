package assignment3;
import java.util.Scanner;
public class question30_fibonacci {
    static void fibbo(int count){
        int num1=0,num2=1,num3;
System.out.println(num1);
System.out.println(num2);
for(int i=2;i<count;++i){
    num3=num1+num2;
    System.out.println(num3);
    num1=num2;
    num2=num3;
}

    }
    public static void main (String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the number: " );
        int  number =obj.nextInt();
        fibbo(number);

    }
}
