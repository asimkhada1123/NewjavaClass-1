package assignment;

import java.util.Scanner;

public class question7_perimeter {
        int peri_rect;
        double peri_triangle;
        double peri_circle;
        question7_perimeter(int l,int w,float a ,float b, float c ,float radius){
            peri_rect=2*(l+w);
            peri_circle= Math.PI *radius*2;
            peri_triangle=a+b+c;

        }
        void display(){
            System.out.println("Perimeter of rectangle:" +peri_rect);
            System.out.println("Perimeter of triangle:" +peri_triangle);
            System.out.println("Perimeter of circle:" +peri_circle);
        }
        public static void main (String[] args){
            int l,w;
            float a,b,c,radius;
            Scanner odj= new Scanner(System.in);
            System.out.println("Enter length");
            l= odj.nextInt();
            System.out.println("Enter breadth");
            w= odj.nextInt();
            System.out.println("Enter Radius");
            radius= odj.nextInt();
            System.out.println("Enter a");
            a= odj.nextInt();
            System.out.println("Enter b");
            b= odj.nextInt();
            System.out.println("Enter c");
            c= odj.nextInt();
            question7_perimeter P = new question7_perimeter(l,w,a,b,c,radius);
            P.display();
        }
}

