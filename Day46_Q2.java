// Q92 (Strings)
// Find the first repeating lowercase alphabet in a string.

import java.util.HashSet;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        HashSet<Character> seen = new HashSet<>();
        char firstRepeating = '\0';

        for (char c : inputString.toCharArray()) {
            if (Character.isLowerCase(c)) {
                if (seen.contains(c)) {
                    firstRepeating = c;
                    break;
                }
                seen.add(c);
            }
        }

        if (firstRepeating != '\0') {
            System.out.println("First repeating lowercase alphabet: " + firstRepeating);
        } else {
            System.out.println("No repeating lowercase alphabet found.");
        }

        sc.close();
    }
}