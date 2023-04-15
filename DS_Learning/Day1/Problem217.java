package Day1;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 */

public class Problem217 {

    public static boolean containsDuplicate(int[] nums) {
        // int size = nums.length;

        // for (int i = 0; i < size; i++) {
        //     for (int j = i + 1; j < size; j++) {
        //         if (nums[j] == nums[i]) {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        // Com : T(n*n), S(1)

        // Arrays.sort(nums);
        // for (int j = 0; j < nums.length; j++) {
        //     if (nums[j] == nums[j+1]) {
        //         return true;
        //     }
        // }
        // return false;

        // Com : 
        // sort : (nlog(n) - Quicksort 2 pivot)
        // + O(n) traverse 
        // --> T(nlog(n)), S(log(n))  
        

        // Set<Integer> set = new HashSet<>();
        // for (int num : nums) {
        //     if (set.contains(num)) {
        //         return true;
        //     }
        //     set.add(num);
        // }
        // return false;
        
        // Com : O(n)

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            // if (map.get(num) >= 2) {
            //     return true;
            // }
            // map.put(num, map.getOrDefault(num, 0) + 1);

            // or 
            if (map.containsKey(num)) {
                return true;
            }
            map.put(num, 1);
        }
        return false;
        
        // Com : O(n)
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        System.out.println(Problem217.containsDuplicate(nums));
    }
}