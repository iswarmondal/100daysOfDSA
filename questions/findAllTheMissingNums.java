import java.util.ArrayList;
import java.util.List;

public class findAllTheMissingNums {

    public static List<Integer> ans(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int n = 0; n < nums.length; n++) {
            if (nums[n] != n + 1) {
                ans.add(i + 1);
            }
        }
        return ans;
    }

    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;

    }

    public static void main(String[] args) {
        int nums[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
    }
}
