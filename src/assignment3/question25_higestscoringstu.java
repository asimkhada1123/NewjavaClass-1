package assignment3;
import java.util.Scanner;
public class question25_higestscoringstu {
    public question25_higestscoringstu() {
        String name=null;
        int number=0;
        String highestName=null;
        double score=0;
        double highest=0;
        Scanner obj= new Scanner(System.in);

        System.out.print("Enter the number of student : ");
        int  number_of_student= obj.nextInt();
        for( number=1;number<=number_of_student;number++){

            System.out.print("\nStudent name : ");
            name = obj.next().toUpperCase();
            System.out.print("Score        : ");
            score = obj.nextInt();

            if (highest<score)
            {
                highest=score;
                 highestName = name;
            }
        }
        System.out.print("\nThe highest student : " + highestName + " score : " + highest );

    }
    public static void main (String[] args){

        new question25_higestscoringstu();

    }


}
