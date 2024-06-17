package michael.solution;

class TwoSumIIInputArrayIsSorted {
    public static int[] twoSum(int[] numbers, int target) {
        int[] indicesOfSum = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                indicesOfSum[0] = left + 1;
                indicesOfSum[1] = right + 1;
                break;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return indicesOfSum;
    }
}