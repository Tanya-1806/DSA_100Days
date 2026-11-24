// Q117 (Logic Enhancers)
// Write a program to take two sorted arrays of size m and n as input. 
// Merge both the arrays such that the merged array is also sorted. Print the merged array.

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] mergedArray = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        while (i < m) {
            mergedArray[k++] = arr1[i++];
        }

        while (j < n) {
            mergedArray[k++] = arr2[j++];
        }

        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}
