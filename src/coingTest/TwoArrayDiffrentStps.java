package coingTest;

public class  TwoArrayDiffrentStps {

    public static double findMedianSortedArrays(int[] a, int[] b) {

        if (a.length > b.length) {
            int[] temp = a;
            a = b;
            b = temp;
        }

        int x = a.length;
        int y = b.length;

        int low = 0, high = x;

        while (low <= high) {
            int valueX = (low + high) / 2;
            int valueY = (x + y + 1) / 2 - valueX;

            int maxX = (valueX == 0) ? Integer.MIN_VALUE : a[valueX - 1];
            int minX = (valueX == x) ? Integer.MAX_VALUE : a[valueX];

            int maxY = (valueY == 0) ? Integer.MIN_VALUE : b[valueY - 1];
            int minY = (valueY == y) ? Integer.MAX_VALUE : b[valueY];


            if (maxX <= minY && maxY <= minX) {

                if ((x + y) % 2 == 0) {
                    return (Math.max(maxX, maxY) + Math.min(minX, minY)) / 2.0;
                } else {
                    return Math.max(maxX, maxY);
                }
            } else if (maxX > minY) {
                high = valueX - 1;
            } else {
                low = valueY + 1;
            }
        }
 return  high;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 4, 6, 9, 11, 13, 17}; // First sorted array
        int[] nums2 = {7, 9, 13, 17, 18, 21, 22};  // Second sorted array

        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + median);
    }
}
