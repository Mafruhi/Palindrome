import java.util.Scanner;

public class PalindromeTest1 {

    // Method to check if a string is palindrome
    public static boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueChecking = true;

        while (continueChecking) {
            // ask the user to enter a string
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            // Check if the input string is a palindrome or not
            boolean isPalindrome = validPalindrome(input);

            // Print the result
            if (isPalindrome) {
                System.out.println(input+" is a palindrome");
            } else {
                System.out.println(input+" is not a palindrome.");
            }

            // if they want to check another string
            System.out.print("Do you want to check another string? (yes/no): ");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                continueChecking = false;
            }
        }

        scanner.close();
    }
}
