// Q2 (User Inputs, Operations & Output)
// Write a program to input two numbers and display their sum, difference, product, and quotient.

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int n2 = sc.nextInt();

        int sum = n1 + n2;
        int difference = n1 - n2;
        int product = n1 * n2;
        double quotient = (double) n1 / n2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
