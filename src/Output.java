import java.util.Scanner;
//使系统输入可用
public class Output {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print ("What's your first name? ");

        String num = input.nextLine();

        System.out.println ("You answered: " + num);

        System.out.println ("");
        //第一段

        System.out.print ("What's your last name? ");

        String breakfast = input.nextLine();

        System.out.println ("You answered: " + breakfast);

        System.out.println ("");
        //第二段

        System.out.print ("What's your age? ");

        String num = input.nextLine();

        System.out.println ("You answered: " + num);

        System.out.println ("");
        //第三段

        System.out.print ("What is your postal number? ");

        String num = input.nextLine();

        System.out.println ("You answered: " + num);

        System.out.println ("");
        //第四段

        System.out.print ("What is the year you born ");

        String num = input.nextLine();

        System.out.println ("You answered: " + num);

        System.out.println ("");
        //第五段

        System.out.print ("What is your school attending ");

        String num = input.nextLine();

        System.out.println ("You answered: " + num);

        System.out.println ("");
        //第六段

    }
}
