package Day2;
/*
 * Given an array of integers nums and 
 * an integer target, return indices of 
 * the two numbers such that they add up 
 * to target.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public static int[] twoSums(int[] nums, int target) {
        int[] result = new int[2];
        
        // for (int i = 0; i < nums.length; i++) {
        //     int sum = nums[i];
        //     for (int j = i+1; j < nums.length; j++) {
        //         sum += nums[j];
        //         if (sum == target){
        //             result[0] = i;
        //             result[1] = j;
        //             break;
        //         } else {
        //             sum = nums[i];
        //         }
        //     }
        // }
        // return result;

        // More Optimize
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        // int[] arr = {2, 7, 11, 15};
        // int[] finalArr = twoSums(arr, 9);

        // int[] arr = {3, 2, 4};
        // int[] finalArr = twoSums(arr, 6);

        // int[] arr = {3, 3};
        // int[] finalArr = twoSums(arr, 6);

        // int[] arr = {3, 0, 2};
        // int[] finalArr = twoSums(arr, 5);

        int[] arr = {-6,1,0,4};
        int[] finalArr = twoSums(arr, -5);

        System.out.println(Arrays.toString(finalArr));
    }
}