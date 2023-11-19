import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1
        int tempValue;

        // 2
        System.out.println("Enter the number of array elements: ");
        int size = sc.nextInt(); // number of elements in an array i.e. size of array

        // 3
        int[] numArray = new int[size];

        // 4 accepting elements in an array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            numArray[i] = sc.nextInt();
        }

        // 5
        System.out.println("You have entered: ");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(numArray[i] + ", ");
        }
        System.out.println(numArray[numArray.length - 1]);

        // 6
        for (int i = 0; i < numArray.length; i++) {
            for (int j = i + 1; j < numArray.length; j++) {
                // 7
                if (numArray[i] > numArray[j]) {
                    tempValue = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = tempValue;
                }
            }
        }

        // 8
        System.out.println("Final array after sorting in ascending order: ");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(numArray[i] + ", ");
        }
        System.out.println(numArray[numArray.length - 1]);
    }
}
