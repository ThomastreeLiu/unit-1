//Name:Thomas
//Program:Madlibs
//purpose:a "filling words game"

import java.util.Scanner;
public class gameoutput {


        public static void main (String args []){


            Scanner scan = new Scanner(System.in);


            System.out.println("Enter a colour: ");

            String col = scan.nextLine();

            System.out.println("Enter a made-up name: ");

            String madeup = scan.nextLine();

            System.out.println("Enter another colour: ");

            String col2 = scan.nextLine();

            System.out.println("Enter a number: ");

            String num = scan.nextLine();

            System.out.println("Enter another number: ");

            String num2 = scan.nextLine();


            System.out.println("");

            System.out.println("A Strange Animal");

            System.out.println("The "+madeup+" is an animal that has "+col+" fur with "+col2);
            System.out.println("spots on its tail. An adult "+madeup+" may weigh over "+num);
            System.out.println("pounds and stand over "+num2+" feet tall.");

        }

    }

