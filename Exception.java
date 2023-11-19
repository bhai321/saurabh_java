public class Main {
    public static void main(String args[]) {
        try {
            // This try block may throw ArithmeticException
            int data = 50 / 0;
            System.out.println("This line won't be executed due to the exception.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e);
        }

        // Rest of the code...
        System.out.println("Rest of the code...");

        // Nested try and catch statement
        try {
            // outer try statement
            try {
                System.out.println("Going to divide");
                // This try block may throw ArithmeticException
                int b = 39 / 0;
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught: " + e);
            }

            try {
                // This try block may throw ArrayIndexOutOfBoundsException
                int a[] = new int[5];
                a[5] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
            }

            System.out.println("Other statement");
        } catch (Exception e) {
            System.out.println("Handled: " + e);
        }

        // This catch block will not execute
        System.out.println("Normal flow..");
        System.out.println("Normal flow..");
        System.out.println("Normal flow..");
        System.out.println("Normal flow..");
    }
}
