package assignment;
import java.util.Scanner;
public class question10_Mathematics {
    double s;
    public question10_Mathematics(double u,double t,double a)
    {
        s=u*t+(0.5*a*t*t);

    }
    void display(){
        System.out.println("s= "+s);

    }
    public static void main (String[] args){
        double u,t,a;
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter u : ");
        u= obj.nextInt();
        System.out.println("Enter t : ");
        t= obj.nextInt();
        System.out.println("Enter a : ");
        a= obj.nextInt();
        question10_Mathematics M= new question10_Mathematics(u,t,a);
        M.display();
    }
}
