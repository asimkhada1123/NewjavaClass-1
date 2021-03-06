package assignment;

import java.util.Scanner;

public class question5_dimension {
    int area_rect;
    double area_triangle;
    double area_circle;
    question5_dimension(int l,int w,float base ,float h ,float radius){
        area_rect=l*w;
        area_circle= Math.PI *radius*radius;
        area_triangle=(0.5) * base *h;

    }
    void display(){
        System.out.println("Area of rectangle:" +area_rect);
        System.out.println("Area of triangle:" +area_triangle);
        System.out.println("Area of circle:" +area_circle);
    }
    public static void main (String[] args){
        int l,w;
        float base,h,radius;
        Scanner odj= new Scanner(System.in);
        System.out.println("Enter length");
        l= odj.nextInt();
        System.out.println("Enter breadth");
        w= odj.nextInt();
        System.out.println("Enter Radius");
        radius= odj.nextInt();
        System.out.println("Enter h");
        h= odj.nextInt();
        System.out.println("Enter base");
        base= odj.nextInt();

        question5_dimension t= new question5_dimension(l,w,base,h,radius);
        t.display();
    }
}


