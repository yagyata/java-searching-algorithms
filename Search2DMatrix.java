import java.util.Scanner;

public class Search2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 68}
        };

        boolean result = searchMatrix(matrix, target);
        System.out.println("Is Target found?: " + result);
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midElement = matrix[mid / cols][mid % cols]; // Convert 1D index to 2D indices

            if (midElement == target) {
                return true;
            } else if (midElement < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
