// Q68 (Arrays (1D))
// Delete an element from an array.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Size of the array
        int[] arr = new int[n]; // Create an array of size n

        // Input the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int elementToDelete = sc.nextInt(); // Element to delete
        int position = -1; // Initialize position to -1 (not found)

        // Find the position of the element to delete
        for (int i = 0; i < n; i++) {
            if (arr[i] == elementToDelete) {
                position = i;
                break;
            }
        }

        // If the element is found, shift elements to the left to delete it
        if (position != -1) {
            for (int i = position; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--; // Decrease the size of the array
        }

        // Print the updated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}