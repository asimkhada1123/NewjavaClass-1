package assignment;
import java.util.Scanner;

public class question9_poundtokg {
    double Kg;

    public question9_poundtokg(double pounds) {
        Kg=0.454*pounds;
    }
    void display(){
        System.out.println("pound to kg is " +Kg+"kg");
    }
    public static void main(String[] args){
        double pounds;
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the weight in pounds in lbs");
        pounds= obj.nextInt();
        question9_poundtokg k= new question9_poundtokg(pounds);
        k.display();
    }
}
