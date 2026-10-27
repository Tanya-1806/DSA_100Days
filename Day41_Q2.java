// Q81 (Strings)
// Count characters in a string without using built-in length functions.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        int count = 0;

        // Count characters in the string
        for (char c : inputString.toCharArray()) {
            count++;
        }

        System.out.println("Number of characters in the string: " + count);
        sc.close();
    }
}