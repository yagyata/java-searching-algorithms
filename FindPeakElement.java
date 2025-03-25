public class FindPeakElement {
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {4, 11, 6, 7, 12, 8};
        int peakIndex = findPeakElement(arr);
        System.out.println("Peak element: " + arr[peakIndex]);
    }
}
