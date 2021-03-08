package assignment3;

public class Question31_pattern {
    static void pattern () {
        int count=5; // variable which holds the size of the series if this will changed then the size will changed.

        for(int i=1;i<=count;i++) // first loop which is used to print the series up to size.

        {

            for(int j=1;j<=i;j++) // second loop which prints the one line elements.

            {

                System.out.print(j); // print the series

            }

            System.out.println(""); // for line change

        }
    }
    public static void main (String[] args){

        pattern();

    }
}

