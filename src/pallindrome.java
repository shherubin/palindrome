import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class pallindrome {

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        System.out.println("Please enter a word to check if it's a palindrome.");
        String userInput = "";
        userInput = stdin.nextLine();
        palindromeLogic(userInput);
        System.out.println(palindromeLogic(""));
    }

    public static String palindromeLogic(String input) {
        String normalInput = "";
        normalInput = normalInput.replace(" ", "");

        String reverse = "";
        for (int i = normalInput.length() - 1; i >= 0; i--) {
            reverse += normalInput.charAt(i);
            System.out.println(reverse);
        }

        boolean isAPalindrome = true;

        for (int i = 0; i < normalInput.length(); i++) {
            if (normalInput.charAt(i) != reverse.charAt(i)) {
                isAPalindrome = false;
            }
        }
        if (isAPalindrome) {
            System.out.println("This is a palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }
        return null;
    }
}
