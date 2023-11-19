import java.util.Scanner;

class AverageArray {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] a = new int[n]; // array initialization and declaration

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }

        float sum = 0, avg;

        // Display elements of an array
        System.out.print("Array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // Find average
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        avg = sum / n;

        System.out.println("Average = " + avg);

        // Close the scanner
        scanner.close();
    }
}
