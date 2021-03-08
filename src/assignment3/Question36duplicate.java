package assignment3;
import java.util.Scanner;
public class Question36duplicate {
    public Question36duplicate(int sum) {
        int j,i,temp;
        Scanner obj = new Scanner(System.in);
        int[] array = new int[sum];

        System.out.println("Enter the element");
        for (i = 0; i < sum; i++) {
            array[i] = obj.nextInt();
        }
        for ( i = 0; i < array.length-1; i++)
        {
            for ( j = i+1; j < array.length; j++)
            {
                if ((array[i] == array[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+array[j]);
                }

    }}}
    public static void main (String[] args){

        new Question36duplicate(5);

    }
}

