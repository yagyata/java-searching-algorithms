import java.util.Scanner;

public class ConcatenateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total numbers of words: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];
        System.out.println("Enter the words: ");
        for(int i=0; i<n; i++) {
            words[i] = sc.nextLine();
        }
        sc.close();
        String result = concatenate(words);
        System.out.println("Concatenated String is: " + result);
    }

    public static String concatenate(String[] words) {
        StringBuffer str = new StringBuffer();
        for(String word : words) {
            str.append(word);
        }
        return str.toString();
    }
}
