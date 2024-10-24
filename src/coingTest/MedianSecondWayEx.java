package coingTest;

import java.util.ArrayList;
import java.util.List;

public class MedianSecondWayEx {
    public static double median(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int size1 = arr1.length;
        int size2 = arr2.length;
        List<Integer> result = new ArrayList<>();

        while (i < size1 && j < size2) {
            if (arr1[i] < arr2[j]) {
                result.add(arr1[i++]);
            } else {
                result.add(arr2[j++]);
            }
        }

        while (i < size1) {
            result.add(arr1[i++]);
        }
        while (j < size2) {
            result.add(arr2[j++]);
        }

        int mid = result.size() / 2;
        if (result.size() % 2 == 0) {
            return (result.get(mid - 1) + result.get(mid)) / 2.0;
        }
        return result.get(mid);
    }
    public static void main(String[] args) {

        int[] a = {1, 2, 4, 6, 9,11,13,17};
        int[] b = {7, 9, 13, 17,18,21,22};

        System.out.println("Two sorted arrays is " + median(a, b));
    }
}
