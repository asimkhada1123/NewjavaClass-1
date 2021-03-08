package Assignment2;

import java.util.Scanner;

public class Question11swapnotemp {
    public static void main (String[] args){
        int x,y;
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter x : ");
        x= obj.nextInt();
        System.out.println("Enter y : ");
        y= obj.nextInt();
        System.out.println("before swapping:"+x+""+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("after swapping:"+x+""+y );

    }
}
