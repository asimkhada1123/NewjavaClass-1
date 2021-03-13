package Takeout_project;

import java.util.Scanner;

public class Take_out {



    public static void displayMainMenu(){
        System.out.println("Choose Type of Meal");
        System.out.println("______________________");
        System.out.println("1.Italian");
        System.out.println("2.Chinese");
        System.out.println("3.American");

    }
    public static void displayItalianFoodMenu(){
        System.out.println("____________________");

        System.out.println("1.Lasagna Tray-Feed5-17.99");
        System.out.println("2.Pizza pack - feed7 15.99");
        System.out.println("3.Gazpacho soup-feed4-12.99");
        System.out.println("Enter Choice");
    }
    public static void displayChineseFoodMenu(){
        System.out.println("____________________");
        System.out.println("1.Chicken and Broccoli-Feed7-18.99");
        System.out.println("2.Sweet and Sour Pork tray - feed7 18.99");
        System.out.println("3.Shrimp Fried Rice Tray -feed5-10.99");
        System.out.println("Enter Choice");
    }
    public static void displayAmericanFoodMenu(){
        System.out.println("____________________");
        System.out.println("1.Hamburger and Hot dog tray-Feed8-21.99");
        System.out.println("2.Grilled ChickenSandwich and Mozzarella Sticks Tray - feed5 22.99");
        System.out.println("3.Barbeque Tray -feeds 10-26.99");
        System.out.println("Enter Choice");
    }
    public static int determineTrays(int people, int feeds){
         int trays=people/feeds;
        return trays;
    }
    public static double getSubtotal(double price, int trays){
    double subtotal=price*trays;
    return subtotal;

    }
    public static double getTax(double subtotal, double taxrate){
        double tax=(taxrate/100)*subtotal;
        return tax;
    }
    public static double getTip(double subtotal, double tipRate){
        double tip =(tipRate/100)*subtotal;
        return tip;
    }
    public static double getGrandTotal(double subtotal, double tax, double tip){
       double grandTotal=subtotal+tax+tip;
       return grandTotal;
    }
    public static double pricePerPerson(double grandTotal, int people){
        double price_person=grandTotal/people;
        return price_person;
    }
    public static int determineLeftOvers(int feeds, int trays, int people){
        int leftovers=trays*feeds-people;
        return leftovers;
    }
    public static void main (String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("how many people are there?");
        int people=a.nextInt();
        displayMainMenu();
        System.out.println("choose one");
        Scanner b =new Scanner(System.in);
        int opt=b.nextInt();
        switch (opt) {
            case 1 -> {
                displayItalianFoodMenu();
                System.out.println("Choose one");
                Scanner c =new Scanner(System.in);
                int optt=c.nextInt();
                switch(optt){
                    case 1->{
                        int taxrate=4;
                        double tiprate=6;
                        int x= determineTrays(people, 5);
                        double y= getSubtotal(17.99, x);
                        double p=getTax(y, taxrate);
                        double q=getTip(y,tiprate);
                        double r= getGrandTotal(y,p,q);
                        double s=pricePerPerson(r,people);
                        int g= determineLeftOvers(optt,x,people);
                        System.out.println("number of trays:"+x);
                        System.out.println("Feed:"+optt);
                        System.out.println("Tax: "+p);
                        System.out.println("Tip: "+q);
                        System.out.println("total:" +r);
                        System.out.println("price per person:" +s);
                        System.out.println("left overs: "+g);
                    }
                    case 2->{
                        int taxrate=4;
                        double tiprate=6;
                        int x= determineTrays(people, 7);
                        double y= getSubtotal(15.99, x);
                        double p=getTax(y, taxrate);
                        double q=getTip(y,tiprate);
                        double r= getGrandTotal(y,p,q);
                        double s=pricePerPerson(r,people);
                        int g= determineLeftOvers(optt,x,people);
                        System.out.println("number of trays:"+x);
                        System.out.println("Feed:"+optt);
                        System.out.println("Tax: "+p);
                        System.out.println("Tip: "+q);
                        System.out.println("total:" +r);
                        System.out.println("price per person:" +s);
                        System.out.println("left overs: "+g);
                    }
                    case 3->{
                        int taxrate=4;
                        double tiprate=6;
                        int x= determineTrays(people, 4);
                        double y= getSubtotal(12.99, x);
                        double p=getTax(y, taxrate);
                        double q=getTip(y,tiprate);
                        double r= getGrandTotal(y,p,q);
                        double s=pricePerPerson(r,people);
                        int g= determineLeftOvers(optt,x,people);
                        System.out.println("number of trays:"+x);
                        System.out.println("Feed:"+optt);
                        System.out.println("Tax: "+p);
                        System.out.println("Tip: "+q);
                        System.out.println("total:" +r);
                        System.out.println("price per person:" +s);
                        System.out.println("left overs: "+g);

                    }
                }
            }
            case 2 -> {
                displayChineseFoodMenu();
                System.out.println("Choose one");
                Scanner d =new Scanner(System.in);
                int opttt=d.nextInt();
                switch(opttt){
                    case 1->{
                        int taxrate=4;
                        double tiprate=6;
                        int x= determineTrays(people, 7);
                        double y= getSubtotal(18.99, x);
                        double p=getTax(y, taxrate);
                        double q=getTip(y,tiprate);
                        double r= getGrandTotal(y,p,q);
                        double s=pricePerPerson(r,people);
                        int g= determineLeftOvers(opttt,x,people);
                        System.out.println("number of trays:"+x);
                        System.out.println("Feed:"+opttt);
                        System.out.println("Tax: "+p);
                        System.out.println("Tip: "+q);
                        System.out.println("total:" +r);
                        System.out.println("price per person:" +s);
                        System.out.println("left overs: "+g);

                    }
                    case 2->{
                        int taxrate=4;
                        double tiprate=6;
                        int x= determineTrays(people, 7);
                        double y= getSubtotal(18.99, x);
                        double p=getTax(y, taxrate);
                        double q=getTip(y,tiprate);
                        double r= getGrandTotal(y,p,q);
                        double s=pricePerPerson(r,people);
                        int g= determineLeftOvers(opttt,x,people);
                        System.out.println("number of trays:"+x);
                        System.out.println("Feed:"+opttt);
                        System.out.println("Tax: "+p);
                        System.out.println("Tip: "+q);
                        System.out.println("total:" +r);
                        System.out.println("price per person:" +s);
                        System.out.println("left overs: "+g);
                    }
                    case 3->{
                        int taxrate=4;
                        double tiprate=6;
                        int x= determineTrays(people, 5);
                        double y= getSubtotal(10.99, x);
                        double p=getTax(y, taxrate);
                        double q=getTip(y,tiprate);
                        double r= getGrandTotal(y,p,q);
                        double s=pricePerPerson(r,people);
                        int g= determineLeftOvers(opttt,x,people);
                        System.out.println("number of trays:"+x);
                        System.out.println("Feed:"+opttt);
                        System.out.println("Tax: "+p);
                        System.out.println("Tip: "+q);
                        System.out.println("total:" +r);
                        System.out.println("price per person:" +s);
                        System.out.println("left overs: "+g);
                    }

                }
            }
            case 3 -> {
                displayAmericanFoodMenu();
                System.out.println("Choose one");
                Scanner e =new Scanner(System.in);
                int optttt=e.nextInt();
                switch(optttt){
                    case 1->{
                        int taxrate=4;
                        double tiprate=6;
                        int x= determineTrays(people, 8);
                        double y= getSubtotal(21.99, x);
                        double p=getTax(y, taxrate);
                        double q=getTip(y,tiprate);
                        double r= getGrandTotal(y,p,q);
                        double s=pricePerPerson(r,people);
                        int g= determineLeftOvers(optttt,x,people);
                        System.out.println("number of trays:"+x);
                        System.out.println("Feed:"+optttt);
                        System.out.println("Tax: "+p);
                        System.out.println("Tip: "+q);
                        System.out.println("total:" +r);
                        System.out.println("price per person:" +s);
                        System.out.println("left overs: "+g);
                    }
                    case 2->{
                        int taxrate=4;
                        double tiprate=6;
                        int x= determineTrays(people, 5);
                        double y= getSubtotal(22.99, x);
                        double p=getTax(y, taxrate);
                        double q=getTip(y,tiprate);
                        double r= getGrandTotal(y,p,q);
                        double s=pricePerPerson(r,people);
                        int g= determineLeftOvers(optttt,x,people);
                        System.out.println("number of trays:"+x);
                        System.out.println("Feed:"+optttt);
                        System.out.println("Tax: "+p);
                        System.out.println("Tip: "+q);
                        System.out.println("total:" +r);
                        System.out.println("price per person:" +s);
                        System.out.println("left overs: "+g);
                    }
                    case 3->{
                        int taxrate=4;
                        double tiprate=6;
                        int x= determineTrays(people, 10);
                        double y= getSubtotal(26.99, x);
                        double p=getTax(y, taxrate);
                        double q=getTip(y,tiprate);
                        double r= getGrandTotal(y,p,q);
                        double s=pricePerPerson(r,people);
                        int g= determineLeftOvers(optttt,x,people);
                        System.out.println("number of trays:"+x);
                        System.out.println("Feed:"+optttt);
                        System.out.println("Tax: "+p);
                        System.out.println("Tip: "+q);
                        System.out.println("total:" +r);
                        System.out.println("price per person:" +s);
                        System.out.println("left overs: "+g);
                    }
                }}
            default -> System.out.println("choose some thing from menu");
        }
    }
}
