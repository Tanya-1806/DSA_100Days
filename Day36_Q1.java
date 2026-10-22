// Q71 (2D Arrays)
// Read and print a matrix.

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

        // Print the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        sc.close();
    }
}
