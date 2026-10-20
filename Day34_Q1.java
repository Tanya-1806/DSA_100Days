// Q67 (Arrays (1D))
// Insert an element in an array at a given position.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Size of the array
        int[] arr = new int[n + 1]; // Create a new array with one extra space

        // Input the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int elementToInsert = sc.nextInt(); // Element to insert
        int position = sc.nextInt(); // Position to insert the element (0-based index)

        // Shift elements to the right to make space for the new element
        for (int i = n; i > position; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert the new element
        arr[position] = elementToInsert;

        // Print the updated array
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}