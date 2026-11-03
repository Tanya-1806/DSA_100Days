// Q95 (Strings)
// Check if one string is a rotation of another.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");      
        String str2 = sc.nextLine();
        if (str1.length() != str2.length()) {
            System.out.println("The strings are not rotations of each other.");
        } else {
            String concatenated = str1 + str1;
            if (concatenated.contains(str2)) {
                System.out.println("The strings are rotations of each other.");
            } else {
                System.out.println("The strings are not rotations of each other.");
            }
        }
        sc.close();
    }
}   