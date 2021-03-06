package assignment;

import java.util.Scanner;

public class question4_Simple_intrest {

    public static void main (String[] args){
        //variable declaration

        float p,t, R,Simple_intrest ;
        //Scanning or taking input
        Scanner obj=new Scanner(System.in);
        System.out.println("P :");
        p=obj.nextInt();
        System.out.println("t:");
        t=obj.nextInt();
        System.out.println("R:");
        R=obj.nextInt();
        //calculating and printing simple interest
        Simple_intrest=((p*t*R)/100);
        System.out.println("Simple Interest:"+ Simple_intrest);

    }
}
