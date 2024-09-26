//Author:Thomas
//Name:FlowerShipping
//purpose:calculate the number of box needed minimum

import java.util.Scanner;
public class FlowerShipping {
    public static void main (String args []){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of flower pots");
        int potnum = scan.nextInt();
        int numbox = potnum/9;
        potnum = potnum%9;
        int total = numbox;
        String ans = numbox+" Very big Boxes,\n";
        numbox = potnum/4;
        potnum = potnum%4;

        total = total+numbox+potnum;
        ans = ans+numbox+" Big Boxes,\n"+potnum+" Small Boxes,\n";
        System.out.println(ans+total+" Total");

    }
}
