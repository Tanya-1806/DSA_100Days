// Q91 (Strings)
// Remove all vowels from a string.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        // Remove all vowels from the string
        StringBuilder noVowelsString = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (!isVowel(c)) {
                noVowelsString.append(c);
            }
        }

        System.out.println("String without vowels: " + noVowelsString.toString());

        sc.close();
    }

    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}