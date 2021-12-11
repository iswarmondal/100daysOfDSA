package questions;

public class firstAndLast {
    public static int[] findRange(int[] nums, int target) {
        int ans[] = { -1, -1 };

        ans[0] = findFirstOccurance(nums, target);
        ans[1] = findLastOccurance(nums, target);

        return ans;
    }

    public static int findFirstOccurance(int[] nums, int target) {
        int firstIndex = -1;
        int start = 0;
        int end = (nums.length) - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                firstIndex = mid;
                end = mid - 1;
            }
        }
        return firstIndex;
    }

    public static int findLastOccurance(int[] nums, int target) {
        int lastIndex = -1;
        int start = 0;
        int end = (nums.length) - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                lastIndex = mid;
                start = mid + 1;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 4, 4, 4, 5 };
        int ans[] = findRange(nums, 4);
        System.out.print(ans[0] + " ");
        System.out.print(ans[1]);
    }
}
