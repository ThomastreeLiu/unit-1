import java.util.Scanner;
import java.text.NumberFormat;
public class autosale {
    public static void main (String args []){
        Scanner scan = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("********************************* \n" +
                "*    Welcome to My Farm Stall   * \n" +
                "********************************* ");
        System.out.println("Enter the amount of each thing you would like to buy");
        System.out.println("1. How many strawberries would you like?");
        int strw = scan.nextInt();
        System.out.println("How many eggplants would you like?");
        int egg = scan.nextInt();
        System.out.println("How many flower would you like?");
        int flow = scan.nextInt();
        System.out.println("How many pumpkins would you like?");
        int pump = scan.nextInt();
        System.out.println("How many soybeans would you like?");
        int syb = scan.nextInt();

        System.out.println("**************************** \n" +
                "*        Food Bill        * \n" +
                "*************************** ");
        System.out.println(strw+" strawberry @ $5 = "+currency.format(5*strw));
        System.out.println(egg+" eggplant @ $2 = "+currency.format(2*egg));
        System.out.println(flow+" flower @ $1 = "+currency.format(1*flow));
        System.out.println(pump+" pumpkin @ $2 = "+currency.format(2*pump));
        System.out.println(strw+" soybean @ $3 gold = "+currency.format(3*syb));
        int sto = 5*strw+2*egg+1*flow+2*pump+5*syb;
        double tax = sto*0.12;
        double tot =sto+tax;
        System.out.println("Subtotal: "+currency.format(sto)+"\nTax: "+currency.format(tax)+"\nTotal: "+currency.format(tot));
        System.out.println("Enter the amount of money paid: $");
        double paid = scan.nextDouble();
        System.out.println("Your charge is "+currency.format(paid-tot));


    }
}
