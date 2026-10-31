// Q89 (Strings)
// Count frequency of a given character in a string.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        char characterToCount = sc.next().charAt(0);

        // Count frequency of the given character
        int frequency = 0;
        for (char c : inputString.toCharArray()) {
            if (c == characterToCount) {
                frequency++;
            }
        }

        System.out.println("Frequency of '" + characterToCount + "': " + frequency);

        sc.close();
    }
}
