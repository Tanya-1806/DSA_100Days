// Q45 (Loops without Arrays/Strings)
// Write a program to find the sum of the series: 2/3 + 4/7 + 6/11 + 8/15 + ... up to n terms.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            int numerator = 2 * i;
            int denominator = 4 * i - 1;
            sum += (double) numerator / denominator;
        }

        System.out.printf("Sum of the series up to %d terms is: %.4f%n", n, sum);

        sc.close();
    }
}