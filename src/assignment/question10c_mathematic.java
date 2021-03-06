package assignment;
import java.util.Scanner;
public class question10c_mathematic {
    double x;

    public question10c_mathematic(double a, double b,double c) {
        x=(-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
    }
    void display(){
        System.out.println("x=  "+x);
    }
    public static void main (String[] args){
        double a,b,c;
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter a : ");
        a= obj.nextInt();
        System.out.println("Enter b : ");
        b= obj.nextInt();
        System.out.println("Enter c : ");
        c= obj.nextInt();

        question10c_mathematic re= new question10c_mathematic(a,b,c);
        re.display();
    }
}