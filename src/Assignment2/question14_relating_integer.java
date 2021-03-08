package Assignment2;
import java.util.Scanner;
public class question14_relating_integer {
    public question14_relating_integer(int a , int b) {
        if(a>b){
            System.out.println("a is greater then b");
        }
        else if(a<b){
            System.out.println("b is greater then a");
        }
        else{
            System.out.println("a is equal to b");
        }
    }
    public static void main (String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number a:");
        int a = obj.nextInt();
        System.out.println("enter the number b:");
        int b = obj.nextInt();
      question14_relating_integer ab= new question14_relating_integer(a,b);

    }
}
