// Q64 (Arrays (1D))
// Find the digit that occurs the most times in an integer number.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int[] digitCount = new int[10]; // Array to count occurrences of each digit (0-9)

        // Count occurrences of each digit
        while (number > 0) {
            int digit = number % 10;
            digitCount[digit]++;
            number /= 10;
        }

        // Find the digit with the maximum occurrences
        int maxCount = 0;
        int mostFrequentDigit = -1;
        for (int i = 0; i < 10; i++) {
            if (digitCount[i] > maxCount) {
                maxCount = digitCount[i];
                mostFrequentDigit = i;
            }
        }

        System.out.println(mostFrequentDigit);

        sc.close();
    }
}