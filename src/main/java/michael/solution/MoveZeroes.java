package michael.solution;

// https://leetcode.com/problems/move-zeroes/description/?envType=study-plan-v2&envId=leetcode-75
class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            int counter = i;
            while (counter >= 0 && nums[counter] != 0) {
                counter--;
            }
            if (counter < i && counter >= 0) {
                for (int j = counter; j < i; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[i] = 0;
            }
        }
    }
}