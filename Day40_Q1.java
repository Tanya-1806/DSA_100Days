// Q79 (2D Arrays)
// Perform diagonal traversal of a matrix.

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

        System.out.println("Diagonal Traversal of the Matrix:");

        // Perform diagonal traversal
        for (int d = 0; d < rows + cols - 1; d++) {
            int r = d < cols ? 0 : d - cols + 1;
            int c = d < cols ? d : cols - 1;

            while (r < rows && c >= 0) {
                System.out.print(matrix[r][c] + " ");
                r++;
                c--;
            }
            System.out.println();
        }

        sc.close();
    }
}