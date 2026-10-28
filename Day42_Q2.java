// Q84 (Strings)
// Convert a lowercase string to uppercase without using built-in functions.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        StringBuilder upperCaseString = new StringBuilder();

        // Convert lowercase string to uppercase
        for (char c : inputString.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                upperCaseString.append((char) (c - ('a' - 'A')));
            } else {
                upperCaseString.append(c);
            }
        }

        System.out.println("Uppercase string: " + upperCaseString.toString());
        sc.close();
    }
}