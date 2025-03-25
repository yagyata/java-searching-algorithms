import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            reader = new BufferedReader(isr);

            FileWriter fw = new FileWriter("user_input.txt");
            writer = new BufferedWriter(fw);

            System.out.println("Enter text (type 'exit' to stop):");
            String input;

            while (!(input = reader.readLine()).equalsIgnoreCase("exit")) {
                writer.write(input);
                writer.newLine();
            }

            System.out.println("User input successfully saved to 'user_input.txt'.");
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            }
            catch (IOException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}