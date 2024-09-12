import java.util.Scanner;
//使系统输入可用
public class Output {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print ("What's your first name? ");

        String firstname = input.nextLine();

        System.out.println ("You answered: " + firstname);

        System.out.println ("");
        //第一段

        System.out.print ("What's your last name? ");

        String lastname = input.nextLine();

        System.out.println ("You answered: " + lastname);

        System.out.println ("");
        //第二段

        System.out.print ("What's your age? ");

        String age = input.nextLine();

        System.out.println ("You answered: " + age);

        System.out.println ("");
        //第三段

        System.out.print ("What is your postal number? ");

        String postal = input.nextLine();

        System.out.println ("You answered: " + postal);

        System.out.println ("");
        //第四段

        System.out.print ("What is the year you born ");

        String born = input.nextLine();

        System.out.println ("You answered: " + born);

        System.out.println ("");
        //第五段

        System.out.print ("What is your school attending ");

        String attending = input.nextLine();

        System.out.println ("You answered: " + attending);

        System.out.println ("");
        //第六段

    }
}
