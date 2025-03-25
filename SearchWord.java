import java.util.Scanner;

public class SearchWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word you want to find: ");
        String word = sc.next();
        String[] sentences = {
                "Hello, My name is Yagyata",
                "I'm a computer science student",
                "I'm pursuing my degree from Chitkara University"
        };
        System.out.println("Sentence where the word you entered is used first: ");
        System.out.println(search(sentences, word));

    }
    public static String search(String[] sentences, String word) {
        for(String sentence : sentences) {
            if(sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not found";
    }
}

/*
Enter the word you want to find: University
Sentence where the word you entered is used first:
I'm pursuing my degree from Chitkara University
 */
