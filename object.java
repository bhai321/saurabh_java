import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Rectangle {
    int width, length;
    String color;

    void setLength(int a) {
        length = a;
    }

    void setWidth(int a) {
        width = a;
    }

    void setColor(String a) {
        color = a;
    }

    int calculateArea() {
        return width * length;
    }

    String getColor() {
        return color;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            Rectangle a = new Rectangle();
            System.out.println("Enter the length for the first rectangle:");
            int lengthA = Integer.parseInt(reader.readLine());
            a.setLength(lengthA);

            System.out.println("Enter the width for the first rectangle:");
            int widthA = Integer.parseInt(reader.readLine());
            a.setWidth(widthA);

            System.out.println("Enter the color for the first rectangle:");
            a.setColor(reader.readLine());

            Rectangle b = new Rectangle();
            System.out.println("Enter the length for the second rectangle:");
            int lengthB = Integer.parseInt(reader.readLine());
            b.setLength(lengthB);

            System.out.println("Enter the width for the second rectangle:");
            int widthB = Integer.parseInt(reader.readLine());
            b.setWidth(widthB);

            System.out.println("Enter the color for the second rectangle:");
            b.setColor(reader.readLine());

            if (a.calculateArea() == b.calculateArea() && a.getColor().equals(b.getColor())) {
                System.out.println("Matching Rectangles");
            } else {
                System.out.println("Non-Matching Rectangles");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
