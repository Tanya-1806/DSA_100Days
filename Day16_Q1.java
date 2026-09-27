// Q31 (Loops without Arrays/Strings)
// Write a program to take a number as input and print its equivalent binary representation.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        StringBuilder binaryRepresentation = new StringBuilder();
        while (num > 0) {
            int remainder = num % 2;
            binaryRepresentation.insert(0, remainder);
            num /= 2;
        }

        System.out.println("The binary representation is: " + binaryRepresentation.toString());
        sc.close();
    }
}