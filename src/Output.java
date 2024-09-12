import java.util.Scanner;
//使系统输入可用
public class Output {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print ("What is your favourite number? ");

        String num = input.nextLine();

        System.out.println ("You answered: " + num);

        System.out.println ("");

        System.out.print ("What did you eat for breakfast? ");

        String breakfast = input.nextLine();

        System.out.println ("You answered: " + breakfast);

        System.out.println ("");

    }
}
