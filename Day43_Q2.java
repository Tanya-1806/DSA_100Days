// Q86 (Strings)
// Check if a string is a palindrome.

import java.util.Scanner;   

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        StringBuilder reversedString = new StringBuilder();

        // Reverse the string
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString.append(inputString.charAt(i));
        }

        // Check if the original string is equal to the reversed string
        if (inputString.equals(reversedString.toString())) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
        sc.close();
    }
}