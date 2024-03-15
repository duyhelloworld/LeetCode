package Day2;

import java.util.Arrays;

/*
 * You are given two integer arrays nums1 and
 * nums2, sorted in non-decreasing order, 
 * and two integers m and n, representing 
 * the number of elements in nums1 and nums2
 * respectively.

 * Merge nums1 and nums2 into a single array
 * sorted in increasing order.

* The final sorted array should not be 
* returned by the function, but instead 
* be stored inside the array nums1. To 
* accommodate this, nums1 has a length 
* of m + n, where the first m elements 
* denote the elements that should be merged,
* and the last n elements are set to 0 and 
* should be ignored. nums2 has a length of n.
 */

public class Problem88 {
    public static void merge(int[] nums1, int[] nums2, int m, int n){
        for (int i = m+n-1; i >= m; i--) {
            nums1[i] = nums2[i-m];
        }
        System.out.println(Arrays.toString(nums1));

        // Solved
        // int p1 = m - 1, p2 = n - 1, i = m + n - 1;
        // while (p2 >= 0) {
        //     if (p1 >= 0 && nums1[p1] > nums2[p2]) {
        //         nums1[i--] = nums1[p1--];
        //     } else {
        //         nums1[i--] = nums2[p2--];
        //     }
        // }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        // int[] nums1 = {1, 2, 3, 0, 0, 0, 0};
        // int[] nums2 = {1, 2, 3, 5};
        merge(nums1, nums2, 3, 3);
    }
}
