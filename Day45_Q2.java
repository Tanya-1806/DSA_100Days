// Q90 (Strings)
// Toggle case of each character in a string.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        // Toggle case of each character
        StringBuilder toggledString = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggledString.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggledString.append(Character.toUpperCase(c));
            } else {
                toggledString.append(c); // Non-alphabetic characters remain unchanged
            }
        }

        System.out.println("Toggled Case String: " + toggledString.toString());

        sc.close();
    }
}