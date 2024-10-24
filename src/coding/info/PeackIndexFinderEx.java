package coding.info;

public class PeackIndexFinderEx {
        public int findPeak(int[] nums) {
            int i = 0;
            int j = nums.length - 1;

            while (i < j) {
                int k = i + (j - i) / 2;
                if (nums[k] < nums[k + 1]) {
                    i = k + 1;
                } else {
                    j = k;
                }
            }
            return i;
        }

        public static void main(String[] args) {
            PeackIndexFinderEx finder = new PeackIndexFinderEx();
            int[] nums = {1, 3, 7, 8, 5, 4};
            int peakIndex = finder.findPeak(nums);
            System.out.println("Prack index::"+peakIndex);
            System.out.println("peack elements ::"+ nums[peakIndex]);
        }
    }
