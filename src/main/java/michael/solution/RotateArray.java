package michael.solution;

import java.lang.reflect.Array;

// https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150
class RotateArray {
    public static void rotate(int[] nums, int k) {
//        for (int i = 0; i < k; i++) {
//            int[] copy = new int[nums.length];
//            System.arraycopy(nums, 0, copy, 0, nums.length);
//            int last = nums[nums.length - 1];
//            System.arraycopy(copy, 0, nums, 1, nums.length - 1);
//            nums[0] = last;
//        }

//        int[] extraArray = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            extraArray[(i + k) % arr.length] = arr[i];
//        }
//        System.arraycopy(extraArray, 0, arr, 0, arr.length);

        k = k % nums.length;
        int current;
        int prev;
        for (int i = 0; i < k; i++) {
            prev = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                current = nums[j];
                nums[j] = prev;
                prev = current;
            }
        }

    }
}