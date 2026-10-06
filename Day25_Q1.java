// Q49 (Nested Loops without Arrays/Strings)
// Write a program to print the following pattern:
// 5
// 45
// 345
// 2345
// 12345

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}