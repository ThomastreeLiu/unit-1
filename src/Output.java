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

        System.out.println("Now, let's ask some more interesting questions.");
        //问题分割

        System.out.print ("Do you like computer coding?");
        String coding = input.nextLine();
        System.out.println ("You answered: " + coding);
        System.out.println ("");
        //第七段

        System.out.print ("What's the answer of 3+4");
        String math = input.nextLine();
        System.out.println ("You answered: " + math);
        System.out.println ("");
        //第八段

        System.out.print ("What is the price of pizza in the cafeteria?");
        String price = input.nextLine();
        System.out.println ("You answered: " + price);
        System.out.println ("");
        //第九段

        System.out.print ("What do you have first period?");
        String course = input.nextLine();
        System.out.println ("You answered: " + course);
        System.out.println ("");
        //第十段

        System.out.print ("Who is your hero");
        String hero = input.nextLine();
        System.out.println ("You answered: " + hero);
        System.out.println ("");
        //第十一段

        System.out.print ("What did you do this summer? ");
        String summer = input.nextLine();
        System.out.println ("You answered: " + summer);
        System.out.println ("");
        //第十段
    }
}
