package ProbSolving;

import java.util.Scanner;

public class pwdtest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        if(password.length() < 8) {
            System.out.println("Your password is too short. It should contain at least 8 characters.");
            System.out.println("Password suggestion: " + generateStrongPassword());
            return;
        }

        if (isStrongPassword(password)) {
            System.out.println("Your password is strong.");
        } else if (isMediumPassword(password)) {
            System.out.println("Your password is medium. It should contain at least one uppercase letter, one lowercase letter, one digit, and one special character.");
            System.out.println("Password suggestion: " + generateStrongPassword());
        } else {
            System.out.println("Your password is weak. It should contain at least one uppercase letter, one lowercase letter, one digit, and one special character.");
            System.out.println("Password suggestion: " + generateStrongPassword());
        }
    }

    private static boolean isStrongPassword(String password) {
        return password.length() >= 8 &&
                containsUppercase(password) &&
                containsLowercase(password) &&
                containsDigit(password) &&
                containsSpecialCharacter(password);
    }

    private static boolean isMediumPassword(String password) {
        return password.length() >= 8 &&
                ((containsUppercase(password) && containsLowercase(password)) ||
                (containsLowercase(password) && containsDigit(password)) ||
                (containsDigit(password) && containsSpecialCharacter(password)) ||
                (containsUppercase(password) && containsSpecialCharacter(password)));
    }

    private static boolean containsUppercase(String password) {
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsLowercase(String password) {
        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsDigit(String password) {
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsSpecialCharacter(String password) {
        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                return true;
            }
        }
        return false;
    }

    private static String generateStrongPassword() {
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChars = "!@#$%^&*()_+-=[]|\\{}:;'<,>.?/";
        String allChars = uppercase + lowercase + digits + specialChars;

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            password.append(allChars.charAt((int) (Math.random() * allChars.length())));
        }
        return password.toString();
    }
}
