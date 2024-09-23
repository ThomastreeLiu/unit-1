//Author:Thomas
//Name:madlibs
//purpose:filling blanks

import java.util.Scanner;

public class inputmadlibs {
    public static void main (String args []){

        Scanner scan = new Scanner(System.in);

//this is just an example to help you understand what is required

        System.out.println("Enter a adjective: ");

        String adj = scan.nextLine();

        System.out.println("Enter a number: ");

        String num = scan.nextLine();

        System.out.println("There're a lot of "+adj+" ways to get to school. " +
                "Here's a list of the top "+num+".");
        //introduction end


       /* System.out.println("Enter a type of building ");

        String col2 = scan.nextLine();

        System.out.println("Enter a number: ");

        String num = scan.nextLine();

        System.out.println("Enter another number: ");

        String num2 = scan.nextLine();


        System.out.println("");

        System.out.println("A Strange Animal");

        System.out.println("The "+madeup+" is an animal that has "+col+" fur with "+col2); System.out.println("spots on its tail. An adult "+madeup+" may weigh over "+num); System.out.println("pounds and stand over "+num2+" feet tall.");
*/
    }
}
