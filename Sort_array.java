import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of names
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create string array called names
        String[] names = new String[n];

        // Take input for each name
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Display the given names
        System.out.println("The Given names are:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }

        // Sorting the names array in alphabetical order
        Arrays.sort(names);

        // Display the names in alphabetical order
        System.out.println("The names in alphabetical order are:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
