/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */
import java.util.ArrayList;
import java.util.List;

public class Solution {
    
    public static boolean containsDuplicate(int[] nums) {
        int size = nums.length;

        List<Integer> source = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            source.add(i, nums[i]);
        }
        for (int i = 0; i < size; i++) {
            result.add(0);
        }

        for (int i = 0; i < size; i++) {
            int numsGetI = source.get(i);
            // result.remove(numsGetI);
            result.add(numsGetI, result.get(numsGetI) + 1);
            // B[num[i]]++;
        }

        for (Integer item : result) {
            if (item >= 2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4};
        System.out.println(Solution.containsDuplicate(nums));
    }
}