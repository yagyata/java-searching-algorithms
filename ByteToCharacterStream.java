import java.io.*;

public class ByteToCharacterStream {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            String fileName = "README.md";
            FileInputStream fis = new FileInputStream(fileName);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            reader = new BufferedReader(isr);

            String line;
            System.out.println("File contents:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            }
            catch (IOException e) {
                System.out.println("Error closing the file: " + e.getMessage());
            }
        }
    }
}