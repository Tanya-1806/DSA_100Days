// Q27 (Loops without Arrays/Strings)
// Write a program to print the sum of the first n odd numbers.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = sc.nextInt();

        int sum = 0;
        System.out.println("The first " + n + " odd numbers are:");
        for (int i = 1; i <= n; i++) {
            int oddNumber = 2 * i - 1;
            System.out.println(oddNumber);
            sum += oddNumber;
        }

        System.out.println("The sum of the first " + n + " odd numbers is: " + sum);
        sc.close();
    }
}