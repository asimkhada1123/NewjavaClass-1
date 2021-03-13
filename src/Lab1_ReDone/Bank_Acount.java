package Lab1_ReDone;
import java.util.Scanner;
public class Bank_Acount {
    String name;
    double balance;
    //Why is the withdrawfee initialized to be 5
    //Should take it from user
   double withdrawfee=5;
    static int Acountnum = 1000;
    
    //Should be in new file 
    public static void main(String[] args)
    
    
    {
        
        Bank_Acount a=new Bank_Acount("jay" );
        a.displaya();

        a.deposit_balance();
        a.displaya();
        a.withdraw_balance(50);
        a.displaya();
        Bank_Acount b=new Bank_Acount("jayD",500);
        b.withdraw_balance(50);
        b.displaya();

    }
    public  Bank_Acount(String name){
        this.name=name;
        this.balance=0;
        Acountnum++;

    }
    public Bank_Acount(String name,double balance){
        this.name=name;
        this.balance=balance;
        Acountnum++;
    }
    public void withdraw_balance(double balance)
    {
        this.balance = this.balance - balance;

    }
    public void withdraw_balance(double balance,double withdrawfee)
    {

        this.balance =this.balance-withdrawfee-balance;

    }
    public void deposit_balance(double balance )
    {

        this.balance = this.balance + balance;

    }
    
    
    public void deposit_balance()
    {
        //Should be in main 
        //Scanner and Enter the amount should be in main 
        //deposit_balance takes balance and depositfee 
        //deposit_balance should be like with_draw_balance
        Scanner a= new Scanner(System.in);
        System.out.println("Enter the amount: " );
        double  balance1 =a.nextInt();
        this.balance = (0.05*balance1)+balance1;


    }

    public  void  displaya( ){
        System.out.println("Name = "+ name);
        System.out.println("Balance = " + this.balance);
        System.out.println("Account Number = " + Acountnum);
    }

}
