import java.util.Scanner;

public class EX9 {

    public static void main(String[] args) {
        System.out.println("Enter a passcode");
        Scanner userinput = new Scanner(System.in);
        String password = "This is the password";
        String passwordguess = userinput.nextLine();


        while (! passwordguess.equals (password)){
            System.out.println("WRONG!!");
            passwordguess = userinput.nextLine();




        }





    }

}
