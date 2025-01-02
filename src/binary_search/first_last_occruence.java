package binary_search;

import java.util.Arrays;

public class first_last_occruence {
    public static void main(String[] args) {
        int[]nums = {5,7,7,8,8,10};
        int target = 8;
        int[]ans=new int[2];
        ans[0]=findFirst(nums,target);
        ans[1]=findLast(nums,target);
        System.out.println(Arrays.toString(ans));


    }
    public static int findFirst(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            System.out.println(mid);
            if (nums[mid] >= target) {
                end = mid - 1;
                System.out.println(end);
            } else {
                start = mid + 1;
            }
            if (nums[mid] == target) index = mid;
        }
        return index;
    }
    private static int findLast(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            if (nums[mid] == target) index = mid;
        }
        return index;
    }
}
