package Assignment4;

public class Question43_exception {
    public static void main (String[] args){
        try{
            int num1=10, num2=0;
            int result=num1/num2;
            System.out.println ("Result: "+result);
        }
        catch(ArithmeticException ae){
            System.out.println ("Error");
        }
        try{
            int a[]=new int[10];
            //Array has only 10 elements
            a[11] = 9;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("ArrayIndexOutOfBounds");
        }
    }
    }


