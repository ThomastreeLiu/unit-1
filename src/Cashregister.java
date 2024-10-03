//Author:Thomas
//Name:Cashregister
//Purpose:choose things to buy

import java.util.Scanner;
public class Cashregister {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the cash in cent.");
        int cash = scan.nextInt();

        if (cash >= 2000) {
            System.out.println("$20 bills: " + cash/2000);
            cash = cash % 2000;
        }
        if (cash >= 1000) {
            System.out.println("$10 bills:" + cash/1000);
            cash = cash % 1000;
        }
        if (cash >= 500) {
            System.out.println("$5 bills:" + cash/500);
            cash = cash % 500;
        }

        int twoonies = cash/200;
        cash = cash%200;
        int loonies = cash/100;
        cash = cash%100;
        int quarters = cash/25;
        cash = cash % 25;
        int dimes = cash/10;
        cash = cash%10;
        int nickel = cash/5;
        cash = cash%5;

        if (twoonies > 0){
            System.out.println("Twoonies:"+twoonies);
        }
        if (loonies > 0){
            System.out.println("Loonies:"+loonies);
        }
        if (quarters > 0) {
            System.out.println("Quarters:" + quarters);
        }
        if (dimes > 0) {
            System.out.println("Dimes:"+dimes);
        }
        if (nickel > 0){
            System.out.println("Nickels:"+nickel);
        }
        if (cash > 0){
            System.out.println("Pennies:"+cash);
        }

    }

}