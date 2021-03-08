package Assignment2;
import java.util.Scanner;
public class question16_oddeven {
    public question16_oddeven(int a) {
        if(a==0){System.out.println("number is 0");}
        else if (a % 2 == 0) {
            System.out.println("number is even");
        }

        else {
            System.out.println("number is odd");
        }
    }
    public static void main (String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the number a : " );
        int a=obj.nextInt();
        question16_oddeven ab= new question16_oddeven(a);

    }
}

