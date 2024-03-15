package Day1;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 */

public class Problem217 {
    public static boolean containsDuplicate(int[] nums) {
        // int length = nums.length;
        // for (int i = 0; i < length; i++) {
        //     for (int j = i+1; j < length; j++) {
        //         if (nums[i] == nums[j]) {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(Integer.valueOf(i));
        }
        return set.size() != nums.length;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 1, 2, 3, 0 };
        System.out.println(containsDuplicate(nums));
    }
}