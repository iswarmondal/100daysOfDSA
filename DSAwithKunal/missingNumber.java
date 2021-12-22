import java.util.Arrays;

public class missingNumber {

    public static int ans(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < nums.length && nums[i] != nums[nums[i]]) {
                swap(nums, i, nums[i]);
            } else {
                i++;
            }
        }

        for (int n = 0; n < nums.length; n++) {
            if (nums[n] != n) {
                return n;
            }
        }
        return nums.length;
    }

    public static void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 3 };
        int a = ans(nums);
        System.out.println(ans(nums));
    }
}
