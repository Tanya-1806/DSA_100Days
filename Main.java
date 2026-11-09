// Q104 (Logic Enhancers)
// Write a Program to take a positive integer n as input, and find the pivot integer x such that 
// the sum of all elements between 1 and x inclusively equals the sum of all elements between x and n 
// inclusively. Print the pivot integer x. If no such integer exists, print -1. 
// Assume that it is guaranteed that there will be at most one pivot integer for the given input.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long total = n * (n + 1) / 2;
        long x = (long) Math.sqrt(total);

        if (x * x == total) {
            System.out.println(x);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}