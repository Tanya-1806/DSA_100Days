// Q28 (Loops without Arrays/Strings)
// Write a program to print the product of even numbers from 1 to n.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = sc.nextInt();

        int product = 1;
        System.out.println("The even numbers from 1 to " + n + " are:");
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
            product *= i;
        }

        System.out.println("The product of even numbers from 1 to " + n + " is: " + product);
        sc.close();
    }
}