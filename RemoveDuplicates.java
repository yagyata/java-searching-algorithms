import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String result = sc.nextLine();
        System.out.println("String after removing duplicates: " + removeDuplicate(result));

    }
    public static String removeDuplicate(String str) {
        StringBuilder result = new StringBuilder();
        HashSet<Character> unique = new HashSet<>();
        for(char ch : str.toCharArray()) {
            if(!unique.contains(ch)){
                unique.add(ch);
                result.append(ch);
            }
        }
        return result.toString();
    }
}
