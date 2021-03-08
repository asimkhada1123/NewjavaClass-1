package Assignment2;
import java.util.Scanner;
public class question19typetriangle {
    public question19typetriangle(int a, int b,int c) {
        if(a==b && b==c )
        {
            System.out.println("triangle is equlatoral");
        }
           else if(a==b || b==c || c==a) {
               System.out.println("triangle is isoceles");

        }
           else
        {
            System.out.println("triangle is scalen");

        }

    }
    public static void main (String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the number a : " );
        int x=obj.nextInt();
        System.out.println("Enter the number b : " );
        int y=obj.nextInt();
        System.out.println("Enter the number c: " );
        int z=obj.nextInt();
        new question19typetriangle (x,y,z);

    }
}
