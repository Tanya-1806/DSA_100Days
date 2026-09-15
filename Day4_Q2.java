// Q8 (User Inputs, Operations & Output)
// Write a program to find and display the sum of the first n natural numbers.

import java.util.Scanner;   

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number n");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of the first " + n + " natural numbers is: " + sum);
    }
}