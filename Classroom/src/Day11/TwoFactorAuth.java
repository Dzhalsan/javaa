package Day11;

import java.util.Scanner;

public class TwoFactorAuth {
    public static void main(String[] args) {
        String correctEmail = "codewise@gmail.com";
        String correctPassword = "Codewiser!";
        int correctOneTimePasscode = 9532;

        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        String password = scanner.nextLine();
        int oneTimePasscode;

        if ((!email.equals(correctEmail)) || (!password.equals(correctPassword))) {
            if (!email.equals(correctEmail)) {
                System.out.println("Incorrect email");
            }

        }

        if (correctEmail.equals(email) && correctPassword.equals(password)) {
            System.out.println("email passw correct");
            System.out.println("passcode sent to phone");
            oneTimePasscode = scanner.nextInt();
            if (oneTimePasscode==correctOneTimePasscode){
                System.out.println("authorized");
            }
            else System.out.println("not authorized");

        }
        else System.out.println("Email and password not correct");



    }
}
