// Q63 (Arrays (1D))
// Merge two arrays.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Merge the two arrays
        int[] mergedArray = new int[n1 + n2];
        for (int i = 0; i < n1; i++) {
            mergedArray[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            mergedArray[n1 + i] = arr2[i];
        }

        // Print the merged array
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }

        sc.close();
    }
}