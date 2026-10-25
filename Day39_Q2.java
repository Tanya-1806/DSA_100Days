// Q78 (2D Arrays)
// Find the sum of main diagonal elements for a square matrix.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt(); // Number of rows
        int cols = sc.nextInt(); // Number of columns

        if (rows != cols) {
            System.out.println("The matrix is not square.");
            return;
        }

        int[][] matrix = new int[rows][cols]; // Create a 2D array (matrix)

        // Input the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        // Calculate the sum of main diagonal elements
        for (int i = 0; i < rows; i++) {
            sum += matrix[i][i];
        }

        System.out.println("The sum of main diagonal elements is: " + sum);

        sc.close();
    }
}