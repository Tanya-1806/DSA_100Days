// Q77 (2D Arrays)
// Check if the elements on the diagonal of a matrix are distinct.

import java.util.HashSet;
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

        HashSet<Integer> diagonalElements = new HashSet<>();
        boolean areDistinct = true;

        // Check if the diagonal elements are distinct
        for (int i = 0; i < rows; i++) {
            if (!diagonalElements.add(matrix[i][i])) {
                areDistinct = false;
                break;
            }
        }

        if (areDistinct) {
            System.out.println("The diagonal elements are distinct.");
        } else {
            System.out.println("The diagonal elements are not distinct.");
        }

        sc.close();
    }
}