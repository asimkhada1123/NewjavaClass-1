package Assignment2;
import java.util.Scanner;
public class question22_table {
    public question22_table(int number) {
        for(int k=1;k<=10;k++){
            int tab=number*k;
            System.out.println(number + "*" + k + "="+tab+ "\n");

        }
    }
    public static void main (String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the number: " );
        int  number =obj.nextInt();

        new question22_table (number);

    }
}
