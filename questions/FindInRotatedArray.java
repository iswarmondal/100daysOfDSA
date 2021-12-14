// 
// This code is really bugy and doesn't work properly
// 

package questions;

public class FindInRotatedArray {

    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[(mid + 1)]) {
                return mid;
            }

            if (nums[0] <= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target, int start, int end) {

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int ans(int[] nums, int target) {
        int pivot = findPivot(nums);

        int ans1 = binarySearch(nums, target, 0, pivot);
        if (ans1 == -1) {
            int ans2 = binarySearch(nums, target, pivot + 1, (nums.length - 1));
            return ans2;
        } else {
            return ans1;
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1 };
        System.out.println(ans(nums, 0));
        // System.out.println(findPivot(nums));
    }
}
