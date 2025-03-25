import java.util.Scanner;

public class FirstNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("First negative number in the array is: " + negative(arr));
    }

    public static int negative(int[] arr) {
        int num = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                flag = true;
                num = arr[i];
                break;
            }
            if (flag == false) {
                num = -1;
            }
        }
        return num;
    }
}
