// Q100 (Strings)
// Print all sub-strings of a string.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("All sub-strings of the string are:");
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                System.out.println(input.substring(i, j));
            }
        }
        sc.close();
    }
}