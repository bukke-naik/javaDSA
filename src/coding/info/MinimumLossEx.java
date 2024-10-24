package coding.info;

public class MinimumLossEx {
    public int[] minLossMethodEx(int[] nums, int k) {
        int n = nums.length;
        if (n == 0 || k == 0) {
            return new int[0];
        }
        int[]  resultOfMinimumLossEx = new int[n - k + 1];// creates an array to hold the results for all possible sliding windows of size
                                                           //  k in the input array nums.

        // Iterate through the array to find minimums
        for (int i = 0; i <= n - k; i++) {
            int min = nums[i];

            // Check the next k elements
            for (int j = i; j < i + k; j++) {
                min = Math.min(min, nums[j]);
            }
            resultOfMinimumLossEx[i] = min;
        }

        return resultOfMinimumLossEx;  // hear we are stored the element found minimum value
    }

    public static void main(String[] args) {
        MinimumLossEx solution = new MinimumLossEx();
        int[] nums = {9, 1, 3, -1, 5, 3, 6, 7};
        int k = 3;
        int[] result = solution.minLossMethodEx(nums, k);

        // Print the result
        for (int min : result) {
            System.out.print(min + " ");
        }
    }
}