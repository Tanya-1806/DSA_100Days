// Q44 (Loops without Arrays/Strings)
// Write a program to find the sum of the series: 1 + 3/4 + 5/6 + 7/8 + … up to n terms.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            int numerator = 2 * i - 1;
            int denominator = 2 * i;
            sum += (double) numerator / denominator;
        }

        System.out.printf("Sum of the series up to %d terms is: %.4f%n", n, sum);

        sc.close();
    }
}