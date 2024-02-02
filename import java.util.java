import java.util.Scanner;

public class LoginProgram {

    public static void main(String[] args) {
        // Set the correct username and password
        String correctUsername = "zetech";
        String correctPassword = "ZU@1997";

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Allow the user 3 attempts
        for (int attempts = 0; attempts < 3; attempts++) {
            // Get username from the user
            System.out.print("Enter username: ");
            String enteredUsername = scanner.nextLine();

            // Get password from the user
            System.out.print("Enter password: ");
            String enteredPassword = getPasswordInput(scanner);

            // Check if the entered username and password are correct
            if (correctUsername.equals(enteredUsername) && correctPassword.equals(enteredPassword)) {
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Login failed. Please try again.");
            }

            // Print a blank line for better readability
            System.out.println();
        }

        // Close the Scanner
        scanner.close();
    }

    // Method to read password input and print * for each character
    private static String getPasswordInput(Scanner scanner) {
       // System.out.print("Enter password (each character will be printed as *): ");
        char[] passwordChars = scanner.nextLine().toCharArray();

        // Print '*' for each character
        for (int i = 0; i < passwordChars.length; i++) {
            System.out.print("*");
        }

        // Print a new line for better formatting
        System.out.println();

        // Return the password as a String
        return new String(passwordChars);
    }
}
