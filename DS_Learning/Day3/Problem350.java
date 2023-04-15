package Day3;

import java.util.Arrays;

/*
 * Given two integer arrays nums1 and nums2, 
 * return an array of their intersection. 
 * Each element in the result must appear as many times
 *  as it shows in both arrays and you may return the 
 * result in any order.
 */
public class Problem350 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        int len = nums1.length > nums2.length ? nums2.length : nums1.length;
        int[] result = new int[len];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result[k] = nums1[i];
                if (i < nums1.length - 1 && nums1[i+1] == result[k]) {
                    i++;
                } else {
                    j++;
                }
                k++;
            } else {
                if (nums1[i] < nums2[j]) {
                    i++;
                } else {
                    j++;
                }
            }
            if (k >= len) {
                break;
            }
        }
        if (k != len) {
            int[] rs = new int[k];
            for (int l = 0; l < k; l++) {
                rs[l] = result[l];
            }
            return rs;
        }
        return result;
    }

    public static void main(String[] args) {
        // int[] nums1 = {1, 2, 2, 1};
        // int[] nums2 = {2, 2};
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        // int[] nums1 = {1, 2};
        // int[] nums2 = {1, 1};
        int[] rs = intersection(nums1, nums2);
        System.out.println(Arrays.toString(rs));
    }
}
