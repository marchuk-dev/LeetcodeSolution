package michael.solution;

import java.util.ArrayList;
import java.util.List;

class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 1) {
            result.add(toList(nums));
            return result;
        }
        backtrack(result, nums, 0);

        return result;
    }

    private static void backtrack(List<List<Integer>> result, int[] nums, int start) {
        if (start == nums.length) {
            result.add(toList(nums));
            return;
        }
        for (int i = start; i < nums.length; i++) {
            swap(nums, i, start);
            backtrack(result, nums, start + 1);
            swap(nums, i, start);
        }

    }

    private static List<Integer> toList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        return list;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}