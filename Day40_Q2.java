// Q80 (2D Arrays)
// Multiply two matrices.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows1 = sc.nextInt(); // Number of rows for first matrix
        int cols1 = sc.nextInt(); // Number of columns for first matrix
        int rows2 = sc.nextInt(); // Number of rows for second matrix
        int cols2 = sc.nextInt(); // Number of columns for second matrix

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

        int[][] matrix1 = new int[rows1][cols1]; // First matrix
        int[][] matrix2 = new int[rows2][cols2]; // Second matrix
        int[][] result = new int[rows1][cols2];  // Resultant matrix

        // Input the first matrix
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input the second matrix
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Perform matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix after Multiplication:");

        // Print the resultant matrix
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}