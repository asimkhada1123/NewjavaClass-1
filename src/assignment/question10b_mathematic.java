package assignment;
import java.util.Scanner;
public class question10b_mathematic {
    double area;

    public question10b_mathematic(double s, double a,double b, double c) {
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    void display(){
        System.out.println("Area is : "+area);
    }
    public static void main (String[] args){
        double s,a,b,c;
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter s : ");
        s= obj.nextInt();
        System.out.println("Enter a : ");
        a= obj.nextInt();
        System.out.println("Enter b : ");
        b= obj.nextInt();
        System.out.println("Enter c : ");
        c= obj.nextInt();
        question10b_mathematic X= new question10b_mathematic(s,a,b,c);
        X.display();
    }
}
