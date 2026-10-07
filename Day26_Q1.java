// Q51 (Nested Loops without Arrays/Strings)
// Write a program to print the following pattern:
//     5
//    45
//   345
//  2345
// 12345

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = n - i + 1; k <= n; k++) {
                System.out.print(k);
            }
            System.out.println();
        }

        sc.close();
    }
}