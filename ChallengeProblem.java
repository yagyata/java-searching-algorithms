import java.util.*;

public class ChallengeProblem {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1, 7, 5, 2, 8};
        int missingPositive = findFirstMissingPositive(arr);
        System.out.println("First Missing Positive Integer: " + missingPositive);

        Arrays.sort(arr);
        int target = 5;
        int targetIndex = binarySearch(arr, target);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Target " + target + " found at index: " + targetIndex);
    }

    public static int findFirstMissingPositive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (num > 0) {
                set.add(num);
            }
        }
        int missing = 1;
        while (set.contains(missing)) {
            missing++;
        }
        return missing;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
