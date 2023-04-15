package Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer array nums, find the
subarray
with the largest sum, and return its sum.
 */
public class Problem53 {
    public static int getLargest(int[] arr){
        int negative = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negative++;
            }
        }
        
        int MaxSum = 0;

        if (negative == 0) {
            for (int element : arr) {
                MaxSum += element;
            }
            return MaxSum;
        }

        if (negative == arr.length) {
            Arrays.sort(arr);
            return arr[arr.length - 1];
        }
        
        List<Integer> sums = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                int j = i;
                int summary = 0;
                while(j < arr.length) {
                    summary += arr[j];
                    sums.add(summary);
                    j++;
                }
            }
        }

        if (sums.isEmpty()) {
            return 0;
        }

        int max = sums.get(0);
        for (int _sum : sums) {
            if (_sum > max) {
                max = _sum; 
            }
        }
        return max;



        // Copy logic
        // int sum = 0, max = arr[0];
        // for (int i = 0; i < arr.length; i++) {
        //     sum += arr[i];
        //     if (sum > max) {
        //         max = sum;
        //     }
        //     if (sum < 0) {
        //         sum = 0;
        //     }
        // }
        // return max;

        // Other implementation
        // int sum = 0 , maxi = Integer.MIN_VALUE;;
        // int i = 0 , j = 0;
        // while(j < arr.length){
           
        //     if(sum < 0 && arr[j] >= sum){
        //         sum = 0;
        //         i = j;
        //     }
        //      sum += arr[j];
        //     maxi = Math.max(maxi , sum);
        //     j++;
        // }
        // return maxi;
    }

    public static void main(String[] args) {
        // int[] arr = {-2, 1, -3, 4, 9, -8, 0};
        // int[] arr = {-2,  1,  -3,  4,  -1,  2,  1,  -5,  4};
        int[] arr = {-1, 2};
        System.out.println(getLargest(arr));
    }
}
