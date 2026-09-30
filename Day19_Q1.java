// Q37 (Loops without Arrays/Strings)
// Write a program to find the LCM of two numbers.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int lcm = Math.max(a, b);

        while (lcm % a != 0 || lcm % b != 0) {
            lcm++;
        }

        System.out.println("LCM = " + lcm);

        sc.close();
    }
}