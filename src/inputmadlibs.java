//Author:Thomas
//Name:madlibs
//purpose:filling blanks

import java.util.Scanner;

public class inputmadlibs {
    public static void main (String args []){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a adjective: ");
        String I = scan.nextLine();

        System.out.println("Enter a number: ");
        String II = scan.nextLine();

        String IP = ("There're a lot of "+I+" ways to get to school. " +
                "Here's a list of the top "+II+".");
        //introduction end


        System.out.println("Enter a type of building ");
        I = scan.nextLine();

        System.out.println("Enter a type of food ");
        II = scan.nextLine();

        System.out.println("Enter a plural noun ");
        String III = scan.nextLine();

        System.out.println("Enter a verb");
        String IV = scan.nextLine();

        String IIP = ("The "+I+" bus:Watch out for "+II+" " +
                "stuck under the seats and hold onto your hardcover "+III+
                " in case the driver has to "+IV+" the brakes.");
        //paragraph 1 out

        System.out.println("Enter a adjective");
        I = scan.nextLine();

        System.out.println("Enter a verb ending in ing");
        II = scan.nextLine();
        String IIIP = ("Bicycle:Check the weather, because it's "+
                I+" to hold an umbrella while "+II+".");
        //paragraph 2 out

        System.out.println("Enter a verb ");
        I = scan.nextLine();

        System.out.println("Enter a animal ");
        II = scan.nextLine();

        System.out.println("Enter a adjective ");
        III = scan.nextLine();

        String IVP = ("Walk:Don't stop to "+I+" every "+II+" along the way" +
                " or you'll be "+III+" for school!");
        //paragraph 3 out

        System.out.println("Enter a noun ");
        I = scan.nextLine();

        System.out.println("Enter a occupation ");
        II = scan.nextLine();

        System.out.println("Enter a plural noun ");
        III = scan.nextLine();
        //paragraph 4 out

        System.out.println(IP);
        System.out.println("1. "+IIP);
        System.out.println("2. "+IIIP);
        System.out.println("3. "+IVP);
        IVP = ("Skate-"+I+": Cool, but if the "+II+" catches you doing " +
                "jumps off the school's front "+III+" , you're getting detention!");
        //paragraph 5 out
        System.out.println("4. "+IVP);
    //output finish
    }
}