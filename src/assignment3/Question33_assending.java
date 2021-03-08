package assignment3;

import java.util.Scanner;

public class Question33_assending {
    public Question33_assending() {
        Scanner obj=new Scanner(System.in);
        int [] array = new int[5];
        int sum=0;
        System.out.println("Enter the element");
        for(int i=0;i<5;i++)
        {
            array[i]=obj.nextInt();
        }
        for (int i = 0; i < 5; i++)
        {
            for (int j = i + 1; j < 5; j++)
            {
                if (array[i] > array[j])
                {
                  int  temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Ascending Order:");
        for (int i = 0; i < 5 ; i++)
        {
            System.out.println(array[i]);
        }
       }

    public static void main (String[] args){

new Question33_assending();

    }

}
