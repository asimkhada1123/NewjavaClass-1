package assignment3;
import java.util.Scanner;
public class Question35_reverseelement {
    public Question35_reverseelement(int sum ) {
        int j,i,temp;
        Scanner obj = new Scanner(System.in);
        int[] array = new int[sum];

        System.out.println("Enter the element");
        for (i = 0; i < sum; i++) {
            array[i] = obj.nextInt();
        }
        j = i - 1;
        i = 0;
        obj.close();
        while(i<j)
        {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

        System.out.print("Reversed array: ");
        for(i=0; i<sum; i++)
        {
            System.out.print(array[i]+ "  ");
        }
    }
    public static void main (String[] args){

        new Question35_reverseelement(5);

    }
    }







