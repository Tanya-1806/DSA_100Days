// Q120 (File Handling)
// Write a program to take a string input. Change it to sentence case.

import java.util.*; 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String sentenceCase = toSentenceCase(input);
        System.out.println(sentenceCase);
    }

    public static String toSentenceCase(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}