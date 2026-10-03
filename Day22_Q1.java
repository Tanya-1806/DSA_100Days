// Q43 (Loops without Arrays/Strings)
// Write a program to check if a number is a strong number.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int originalNumber = number;
        int sumOfFactorials = 0;

        while (number > 0) {
            int digit = number % 10;
            sumOfFactorials += factorial(digit);
            number /= 10;
        }

        if (sumOfFactorials == originalNumber) {
            System.out.println(originalNumber + " is a strong number.");
        } else {
            System.out.println(originalNumber + " is not a strong number.");
        }

        sc.close();
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}