// Q118 (Logic Enhancers)
// Write a program to take an input array of size n. The array should contain all the integers 
// between 0 to n except for one. Print that missing number

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int xor = 0;

        for (int i = 0; i < n; i++) {
            xor ^= sc.nextInt();
        }

        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }

        System.out.println(xor);
    }
}

