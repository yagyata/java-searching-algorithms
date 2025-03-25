public class FindRotationPoint {
    public static void main(String[] args) {
        int[] rotatedArray = {15, 18, 21, 23, 6, 12};
        int rotationIndex = rotationPoint(rotatedArray);

        System.out.println("Index of smallest element (Rotation point index): " + rotationIndex); //4
    }
    public static int rotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while(left < right) {
            int mid = left+(right - left) / 2;
            if(arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
