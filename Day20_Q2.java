// Q40 (Loops without Arrays/Strings)
// Write a program to find the 1’s complement of a binary number and print it.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String binaryNumber = sc.nextLine();
        StringBuilder onesComplement = new StringBuilder();

        for (int i = 0; i < binaryNumber.length(); i++) {
            char bit = binaryNumber.charAt(i);
            if (bit == '0') {
                onesComplement.append('1');
            } else if (bit == '1') {
                onesComplement.append('0');
            } else {
                System.out.println("Invalid binary number.");
                sc.close();
                return;
            }
        }

        System.out.println("1's complement = " + onesComplement.toString());

        sc.close();
    }
}
