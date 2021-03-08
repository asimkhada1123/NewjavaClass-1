package Assignment2;
import java.util.Scanner;
public class Question12roll_name_nastionality {

 Question12roll_name_nastionality(){

    Scanner obj= new Scanner(System.in);
     System.out.println("Enter Roll" );
    String roll=obj.nextLine();
     System.out.println("Enter name" );
    String name=obj.nextLine();
     System.out.println("Enter nationality" );
    String nationality=obj.nextLine();
     System.out.println("Roll    Name    nationality" );
     System.out.println( roll +"    " + name +"    " +  nationality);
}

    public static void main (String[] args){

    Question12roll_name_nastionality p= new Question12roll_name_nastionality();


    }

}
