//Author:Thomas
//Name:Cashregister
//Purpose:choose things to buy

import java.util.Scanner;
public class Cashregister {
    public static void main (String args []){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the cash in cent.");
        int cash = scan.nextInt();

        if (cash >= 2000) {
            System.out.println("$20 bills: "+cash/2000);
            cash = cash%2000;
        } else if (cash >= 1000) {
            System.out.println("$10 bills:"+cash/1000);
            cash = cash%1000;
        } else if (cash >= 500) {
            System.out.println("$5 bills:"+cash/500);
            cash = cash%500;
        }
        /////
        int twoonies = cash/ ;
        cash = cash% ;
        int loonies = cash

                //////


        int quarters = cash/25;
        cash = cash%25;
        int dimes = cash/25;
        cash = cash%10;
        int nickel = cash/5;



    }
}
