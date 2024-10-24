package coingTest;

public class BinarySearchExSortingArrayEx {

    public static double Median(int[] nums1, int[] nums2) {

        if(nums1.length < nums2.length)
            return Median(nums2, nums1);

        int i = 0, j = 0, k = 0;
        int medianIndex = (nums1.length-nums2.length)/2 + nums2.length + 1;
        int arr[] = new int[medianIndex];

        while(i < nums1.length && j < nums2.length && k != medianIndex){
            if(nums1[i] < nums2[j]){
                arr[k] = nums1[i++];
            }else{
                arr[k] = nums2[j++];
            }
            k++;
        }

        while(i < nums1.length && k != medianIndex){
            arr[k++] = nums1[i++];
        }

        while(j < nums2.length && k != medianIndex){
            arr[k++] = nums2[j++];
        }

        return (nums1.length + nums2.length) % 2 != 0 ?
                arr[(nums1.length + nums2.length)/2] :
                (double)(arr[((nums1.length + nums2.length)-1)/2]
                        +
                        arr[((nums1.length + nums2.length)-1)/2 + 1])/2;
    }
    public static void main(String[] args) {

        int[] a = {1, 2, 4, 6, 9,11,13,17};
        int[] b = {7, 9, 13, 17,18,21,22};

        System.out.println("Two sorted arrays is " + Median(a, b));
    }
}
