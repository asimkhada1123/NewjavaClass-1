package lab1constructorandmethodoverloading;

import java.util.Scanner;
public class BankAccount {
static double initbalance=0;
static int accountnumber=0;
    public BankAccount() {
        int yes=0,yes1=0;

        String name;
        Scanner odj= new Scanner(System.in);
        System.out.println("Do you want to open account?");
        System.out.println("press 1");
        yes= odj.nextInt();
        System.out.println("Do you have money to deposit?");
        System.out.println("press 1 for yes and 0 for no");
        yes1= odj.nextInt();
        if(yes==1 && yes1==0) {
            Scanner oddj= new Scanner(System.in);
            System.out.println("Enter your name");
            name= oddj.nextLine();
             accountnumber = 12345;
            System.out.println("your account number is "+accountnumber+" and balance is 0");
        }
        else if (yes==1 && yes1==1){
            Scanner odddj= new Scanner(System.in);
            System.out.println("Enter your name");
            name= odddj.nextLine();
             accountnumber = 5678;
            System.out.println("Enter the initial balance");
            initbalance= odddj.nextInt();
            System.out.println("your account number is "+accountnumber+" and balance is "+initbalance);

        }



    }
    public static void withdraw(double initbalance,int accountnumber){
        double withdraw_amount=0;
        Scanner R = new Scanner(System.in);
        System.out.println("How much you want to withdraw");
        withdraw_amount= R.nextInt();
        if(withdraw_amount<500) {
            initbalance = initbalance - withdraw_amount;

            System.out.println("your new balance is " + initbalance);
            System.out.println("your account number is "+accountnumber+"and new balance is "+initbalance);
        }
        else {
            System.out.println("come back later");
            System.out.println("your account number is "+accountnumber+" and new balance is "+initbalance);
        }

    }
    public static void withdraw(int a,double initbalance,int accountnumber){
        double withdraw_amount=0;
        Scanner Rr = new Scanner(System.in);
        System.out.println("How much you want to withdraw");
        withdraw_amount= Rr.nextInt();
        initbalance= initbalance-withdraw_amount-a;

        System.out.println("your account number is "+accountnumber+" and new balance is "+initbalance);
    }
    public static void deposit(double initbalance,int accountnumber)
    {
        double deposit_amount;
        Scanner Rrr = new Scanner(System.in);
        System.out.println("How much you want to deposit");
        deposit_amount= Rrr.nextInt();
        if(initbalance<500) {
            initbalance = initbalance + deposit_amount;

            System.out.println("your account number is "+accountnumber+" and new balance is "+initbalance);
        }
        else {
            System.out.println("come back later");
            System.out.println("your account number is "+accountnumber+" and balance is "+initbalance);
        }

    }
    public static void deposit(int a, double initbalance,int accountnumber)
    {
        double deposit_amount;
        Scanner Rrr = new Scanner(System.in);
        System.out.println("How much you want to deposit");
        deposit_amount= Rrr.nextInt();
        if(deposit_amount>500){
        initbalance= initbalance+deposit_amount;
        initbalance=initbalance+initbalance*(a/100);

        System.out.println("your account number is "+accountnumber+" and new balance is "+initbalance);
        System.out.println("you can only take out money next month");}
        else {
            System.out.println("come back later");
            System.out.println("your account number is "+accountnumber+" and balance is "+initbalance);
        }


    }
    void display(int sum,double balance){
        System.out.println("account number is "+sum);
        System.out.println("balance is "+ balance);
    }
    public static void main (String[] args){
        int status;
        System.out.println("Welcome to My Bank");
        BankAccount p= new BankAccount();
        Scanner m= new Scanner(System.in);
        System.out.println("press 1 for  withdraw, 2 for deposit or 3 for exit");
        status= m.nextInt();

        if(status==1){

            System.out.println("press 1 if you want to withdraw less then 500 else press 2 ");
            Scanner q= new Scanner(System.in);
            int status_withdraw=q.nextInt();
            if(status_withdraw==1){
            withdraw(initbalance,accountnumber);}
            else
                System.out.println("There is 5 dollar charge");
            {withdraw(5,initbalance,accountnumber);}
        }
        else if(status==2){
            System.out.println("press 1 if you want to withdraw less then 500 else press 2 ");
            Scanner qq= new Scanner(System.in);
            int status_deposit=qq.nextInt();
            if(status_deposit==1){
                deposit(initbalance,accountnumber);}
            else{
                System.out.println("There is 5% interest increase");
            deposit(5,initbalance,accountnumber);}
        }
        else{
            System.out.println("Have a nice Day ");
            System.out.println("your account number is "+accountnumber+" and balance is "+initbalance);
        }
    }
}
