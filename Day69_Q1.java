// Q119 (Logic Enhancers)
// Write a program to take an integer array as input. Only one element will be repeated. 
// Print the repeated element. Try to find the result in one single iteration.

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int xor = 0;

        for (int i = 0; i < n; i++) {
            xor ^= sc.nextInt();
        }

        for (int i = 1; i <= n - 1; i++) {
            xor ^= i;
        }

        System.out.println(xor);
    }
}