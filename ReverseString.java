import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string you want to reverse: ");
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println("The reversed string is: " + str.reverse().toString());
    }
}
