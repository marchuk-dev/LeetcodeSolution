package michael.solution;

import java.util.Arrays;

// https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150
class MajorityElement {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}