// Q112 (Logic Enhancers)
// Write a program to take an integer array arr as input. 
// The task is to find the maximum sum of any contiguous subarray using Kadane's algorithm. 
// Print the maximum sum as output. 
// If all elements are negative, print the largest (least negative) element.


import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];
        for (int i = 1; i < n; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        System.out.println(maxSoFar);
    }
}