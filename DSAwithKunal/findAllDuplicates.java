import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAllDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int corr = nums[i] - 1;
                if (nums[corr] != nums[i]) {
                    swap(nums, i, corr);
                } else {
                    ans.add(nums[i]);
                }
            } else {
                i++;
            }
        }

        return ans;
    }

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(Arrays.toString(findAllDuplicates(arr)));
    }
}