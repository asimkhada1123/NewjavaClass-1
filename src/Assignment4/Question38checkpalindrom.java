package Assignment4;
import java.util.Scanner;
public class Question38checkpalindrom {
    public static void palindromfinder(){
        String a, b = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        a = sc.nextLine();

        int length = a.length();

        for ( int i = length - 1; i >= 0; i-- )
            b = b + a.charAt(i);

        if (a.equals(b))
            System.out.println(a+" is a palindrome");
        else
            System.out.println(a+" is not a palindrome");

    }
    public static void main (String[] args){
       palindromfinder();

    }
}
