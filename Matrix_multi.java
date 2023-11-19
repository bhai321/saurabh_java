import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the matrix size
        System.out.print("Enter the number of rows for the matrices: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns for the matrices: ");
        int cols = scanner.nextInt();

        // Creating two matrices
        int a[][] = new int[rows][cols];
        int b[][] = new int[rows][cols];

        // Taking input for the first matrix
        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                a[i][j] = scanner.nextInt();
            }
        }

        // Taking input for the second matrix
        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                b[i][j] = scanner.nextInt();
            }
        }

        // Displaying the first matrix
        System.out.println("First matrix is ::");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(); // new line
        }

        // Displaying the second matrix
        System.out.println("Second matrix is ::");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(); // new line
        }

        // Creating another matrix to store the sum of two matrices
        int c[][] = new int[rows][cols];

        // Adding and printing the addition of two matrices
        System.out.println("Addition of matrices is ::");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                c[i][j] = a[i][j] + b[i][j]; // use - for subtraction
                System.out.print(c[i][j] + " ");
            }
            System.out.println(); // new line
        }

        // Close the scanner
        scanner.close();
    }
}
