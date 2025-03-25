import java.util.Scanner;

public class FindOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 4, 4, 4, 5, 6, 8, 8};
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        int firstIndex = firstOccurrence(arr, target);
        int lastIndex = lastOccurrence(arr, target);

        System.out.println("First occurrence index: " + firstIndex);
        System.out.println("Last occurrence index: " + lastIndex);
    }

    public static int firstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, first = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last;
    }
}

/*
Enter the target element: 4
First occurrence index: 1
Last occurrence index: 3
 */
