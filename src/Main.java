import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int age = 0;
    String enterPlease = "Welcome to the theater! What is your age?: ";

        System.out.print(enterPlease);
        age = in.nextInt();

        if(age >= 21)
        {
            System.out.println("You are over the age of 21, so you get a wristband. Enjoy!");
        }

    }
}