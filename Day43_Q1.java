// Q85 (Strings)
// Reverse a string.

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

        System.out.println("Reversed string: " + reversedString.toString());
        sc.close();
    }
}