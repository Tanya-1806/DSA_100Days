// Q73 (2D Arrays)
// Find the sum of each row of a matrix and store it in an array.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt(); // Number of rows
        int cols = sc.nextInt(); // Number of columns
        int[][] matrix = new int[rows][cols]; // Create a 2D array (matrix)

        // Input the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Create an array to store the sum of each row
        int[] rowSums = new int[rows];

        // Calculate the sum of each row
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
            rowSums[i] = sum;
        }

        // Print the sum of each row
        for (int i = 0; i < rows; i++) {
            System.out.println("Sum of row " + (i + 1) + ": " + rowSums[i]);
        }

        sc.close();
    }
}