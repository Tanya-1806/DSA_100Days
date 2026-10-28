// Q83 (Strings)
// Count vowels and consonants in a string.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;

        // Count vowels and consonants in the string
        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) {
                char lowerC = Character.toLowerCase(c);
                if (lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Number of vowels in the string: " + vowelCount);
        System.out.println("Number of consonants in the string: " + consonantCount);
        sc.close();
    }
}
