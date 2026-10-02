// Q41 (Loops without Arrays/Strings)
// Write a program to swap the first and last digit of a number.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        String numberStr = Integer.toString(number);

        if (numberStr.length() < 2) {
            System.out.println("Number must have at least two digits.");
            sc.close();
            return;
        }

        char firstDigit = numberStr.charAt(0);
        char lastDigit = numberStr.charAt(numberStr.length() - 1);

        String swappedNumberStr = lastDigit + numberStr.substring(1, numberStr.length() - 1) + firstDigit;
        int swappedNumber = Integer.parseInt(swappedNumberStr);

        System.out.println("Swapped number = " + swappedNumber);

        sc.close();
    }
}