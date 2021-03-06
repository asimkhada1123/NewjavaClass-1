package assignment;

import java.util.Scanner;

public class question6_cylinder {
    double volume;

    public question6_cylinder(double height , double radius) {
        volume = Math.PI *radius*radius*height;
    }
    void display(){
        System.out.println("Volume of Cylinder:" +volume);
    }
    public static void main (String[] args){
       double radius, height;
        Scanner odj= new Scanner(System.in);

        System.out.println("Enter Radius");
        radius= odj.nextInt();
        System.out.println("Enter h");
        height= odj.nextInt();

        question6_cylinder C= new question6_cylinder(height,radius);

        C.display();
    }
}
