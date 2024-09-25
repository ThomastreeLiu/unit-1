//Author:Thomas
//Name:madlibs
//purpose:filling blanks

import java.util.Scanner;

public class inputmadlibs {
    public static void main (String args []){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a adjective. ");
        String word1 = scan.nextLine();

        System.out.println("Enter a number. ");
        String word2 = scan.nextLine();

        String paragraph1 = ("There're a lot of "+word1+" ways to get to school. " +
                "Here's a list of the top "+word2+".");
        //introduction out


        System.out.println("Enter a type of building. ");
        word1 = scan.nextLine();

        System.out.println("Enter a type of food. ");
        word2 = scan.nextLine();

        System.out.println("Enter a plural noun. ");
        String word3 = scan.nextLine();

        System.out.println("Enter a verb.");
        String word4 = scan.nextLine();

        String paragraph2 = ("The "+word1+" bus:Watch out for "+word2+" " +
                "stuck under the seats and hold onto your hardcover "+word3+
                " in case the driver has to "+word4+" the brakes.");
        //paragraph 1 out

        System.out.println("Enter a adjective.");
        word1 = scan.nextLine();

        System.out.println("Enter a verb ending in ing.");
        word2 = scan.nextLine();
        String paragraph3 = ("Bicycle:Check the weather, because it's "+
                word1+" to hold an umbrella while "+word2+".");
        //paragraph 2 out

        System.out.println("Enter a verb. ");
        word1 = scan.nextLine();

        System.out.println("Enter a animal. ");
        word2 = scan.nextLine();

        System.out.println("Enter a adjective. ");
        word3 = scan.nextLine();

        String paragraph4 = ("Walk:Don't stop to "+word1+" every "+word2+" along the way" +
                " or you'll be "+word3+" for school!");
        //paragraph 3 out

        System.out.println("Enter a noun. ");
        word1 = scan.nextLine();

        System.out.println("Enter a occupation. ");
        word2 = scan.nextLine();

        System.out.println("Enter a plural noun. ");
        word3 = scan.nextLine();
        //paragraph 4 out

        System.out.println(paragraph1);
        System.out.println("1. "+paragraph2);
        System.out.println("2. "+paragraph3);
        System.out.println("3. "+paragraph4);
        paragraph4 = ("Skate-"+word1+": Cool, but if the "+word2+" catches you doing " +
                "jumps off the school's front "+word3+" , you're getting detention!");
        //paragraph 5 out
        System.out.println("4. "+paragraph4);
    //output finish
    }
}