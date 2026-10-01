// Q39 (Loops without Arrays/Strings)
// Write a program to find the product of odd digits of a number.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int product = 1;
        boolean hasOddDigit = false;

        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 != 0) { // Check if the digit is odd
                product *= digit;
                hasOddDigit = true;
            }
            num /= 10;
        }

        if (hasOddDigit) {
            System.out.println("Product of odd digits = " + product);
        } else {
            System.out.println("No odd digits found.");
        }

        sc.close();
    }
}