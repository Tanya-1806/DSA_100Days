// Q38 (Loops without Arrays/Strings)
// Write a program to find the sum of digits of a number.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}