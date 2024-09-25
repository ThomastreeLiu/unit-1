//Author:Thomas
//Name:Eggcalculate
//purpose:number the egg

import java.util.Scanner;
public class Eggcalculate {
    public static void main (String args []){
        Scanner scan = new Scanner(System.in);

        System.out.println("How many eggs?");
        int egg = scan.nextInt();
        int crate = egg/180;
        egg = egg%180;
        int carton = egg/12;
        egg = egg%12;
        System.out.println("That's "+crate+" crate(s), "+carton+" carton(s) ,and "+egg+"(s) left over.");
    }
}
