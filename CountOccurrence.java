import java.io.*;
import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the filename: ");
        String fileName = sc.nextLine();

        System.out.print("Enter the word to search: ");
        String searchWord = sc.nextLine();

        int wordCount = 0;

        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                line = line.replaceAll("[^a-zA-Z ]", "").toLowerCase();

                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equals(searchWord.toLowerCase())) {
                        wordCount++;
                    }
                }
            }
            System.out.println("The word '" + searchWord + "' appears " + wordCount + " times in the file.");
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

/*
Enter the filename: README.md
Enter the word to search: Search
The word 'Search' appears 2 times in the file.
 */