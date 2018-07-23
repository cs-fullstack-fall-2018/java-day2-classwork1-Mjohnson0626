import java.util.Scanner;

public class EX9 {

    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        String password = "This is the password";
        String passwordguess = userinput.nextLine();

        System.out.println("Enter passcode");

        while (! passwordguess.equals (password)){
            System.out.println("WRONG!!");
            System.out.println("Enter passcode");
            passwordguess = userinput.nextLine();

            if (passwordguess == password);
            System.out.println("CORRECT!!");


        }





    }

}
