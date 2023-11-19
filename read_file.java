import java.io.*;

public class read_file {
    public static void main(String args[]) {
        try {
            File file = new File("Demo.txt"); // Creates a new file instance
            FileReader fr = new FileReader(file); // Reads the file
            BufferedReader br = new BufferedReader(fr); // Creates a buffering character input stream

            StringBuilder sb = new StringBuilder(); // Constructs a StringBuilder with no characters

            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n"); // Appends line to StringBuilder with a line feed
            }

            fr.close(); // Closes the stream and releases the resources

            System.out.println("Contents of File: ");
            System.out.println(sb.toString()); // Converts StringBuilder to a string and prints it
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
