package Day1;

/**
 * Given an integer array nums, find the
    subarray with the largest sum, and return its sum.
 */
public class Problem53 {
    public static int getLargest(int[] arr){
        // Count frequency negative number
        // int negative = 0;
        // int length = arr.length;
        // for (int i = 0; i < length; i++) {
        //     if (arr[i] < 0) {
        //         negative++;
        //     }
        // }
        
        // int MaxSum = 0;
        // // If array is fully positive, return itself
        // if (negative == 0) {
        //     for (int element : arr) {
        //         MaxSum += element;
        //     }
        //     return MaxSum;
        // }

        // if (negative == length) {
        //     Arrays.sort(arr);
        //     return arr[length - 1];
        // }
        
        // // Count if array is mix of positive and negative
        // List<Integer> sums = new ArrayList<>();

        // for (int i = 0; i < length; i++) {
        //     if (arr[i] > 0) {
        //         int j = i;
        //         int summary = 0;
        //         while(j < length) {
        //             summary += arr[j];
        //             sums.add(summary);
        //             j++;
        //         }
        //     }
        // }

        // // No any subarray
        // if (sums.isEmpty()) {
        //     return 0;
        // }

        // int max = sums.get(0);
        // for (int _sum : sums) {
        //     if (_sum > max) {
        //         max = _sum; 
        //     }
        // }
        // return max;

        // Optimized code
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
        int sum = 0, max = Integer.MIN_VALUE;
        int i = 0;
        while(i < arr.length){
            if (sum < 0 && arr[i] >= sum) {
                sum = 0;
            }
            sum += arr[i];
            max = Math.max(max, sum);
            i++;
        }
        return max;
    }

    public static void main(String[] args) {
        // int[] arr = {-2, 1, -3, 4, 9, -8, 0};                    // 13
        // int[] arr = { -2,  1,  -3,  4,  -1,  2,  1,  -5,  4};    // 6
        // int[] arr = { -1, -1, -10, -2, -2 };                     // -1
        // int[] arr = {-1, 2};                                        // 2
        // System.out.println(getLargest(arr));
    }
}
