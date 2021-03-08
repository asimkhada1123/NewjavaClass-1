package assignment3;

import java.util.Scanner;

public class Question34_secondlargest {
    public static int secondlargest(int sum) {
        Scanner obj=new Scanner(System.in);
        int [] array = new int[5];

        System.out.println("Enter the element");
        for(int i=0;i<sum;i++)
        {
            array[i]=obj.nextInt();
        }
        for (int i = 0; i < sum; i++)
        {
            for (int j = i + 1; j < sum; j++)
            {
                if (array[i] > array[j])
                {
                    int  temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[sum-2];
    }
    public static void main (String[] args){
        System.out.println("Second Largest: "+secondlargest(5));

    }
}
