package Assignment2;
import assignment.question10c_mathematic;

import java.util.Scanner;
public class Question11Swap {

    public static void main (String[] args){
       int x,y,t;
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter x : ");
        x= obj.nextInt();
        System.out.println("Enter y : ");
        y= obj.nextInt();
        System.out.println("before swapping:"+x+""+y);
        t=x;
        x=y;
        y=t;
        System.out.println("after swapping:"+x+""+y );

    }
}
