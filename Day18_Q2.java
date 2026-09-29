// Q36 (Loops without Arrays/Strings)
// Write a program to find the HCF (GCD) of two numbers.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int hcf = 1; // Initialize HCF to 1
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i; // Update HCF if both numbers are divisible by i
            }
        }

        System.out.println("HCF (GCD) of " + num1 + " and " + num2 + " is: " + hcf);
        scanner.close();
    }
}