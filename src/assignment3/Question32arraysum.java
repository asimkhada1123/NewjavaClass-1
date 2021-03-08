package assignment3;
import java.util.Scanner;
public class Question32arraysum {
    public Question32arraysum() {
        Scanner obj=new Scanner(System.in);
        int [] array = new int[10];
        int sum=0;
        System.out.println("Enter the element");
        for(int i=0;i<10;i++)
        {
            array[i]=obj.nextInt();
        }
        for(int num:array){
            sum=sum+num;
        }
        System.out.println("sum is " +sum );}
        public static void main (String[] args){

        new Question32arraysum();

        }

}
