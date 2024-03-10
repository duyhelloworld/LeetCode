import java.util.Arrays;

public class Problem27 {

    public static void main(String[] args) {
        int[] nums = new int[] {3, 100, 2, 100};
        int val = 100;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
            } else {
                nums[i-count] = nums[i];
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(nums));
    }
}