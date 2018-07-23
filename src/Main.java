import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("How awsome is Kenn and Kevin");
        Scanner answer = new Scanner(System.in);
        String onlyanswer = "very awsome";
        String rightanswer = answer.nextLine();

        while (! rightanswer.equals(onlyanswer)){
            System.out.println("Try again");
            System.out.println("How awsome is Kenn and Kevin");
            rightanswer = answer.nextLine();

        }

    }
}