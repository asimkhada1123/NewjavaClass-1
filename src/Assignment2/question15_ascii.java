package Assignment2;
import java.util.Scanner;
public class question15_ascii {
    public question15_ascii() {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter ascii number : " );
        int ascii_number=obj.nextInt();
        char b = (char) ascii_number ;
        System.out.println("Enter ascii number : "+b );
    }
    public static void main (String[] args){

       question15_ascii ab= new question15_ascii();

    }
}
