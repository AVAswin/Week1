public class RotationPointFinder {
    public static int findRotationPoint(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}