package michael.solution;

// https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, i = n + m - 1;
        for (int j = i; j >= 0; j--) {
            if (p2 < 0) {
                break;
            }
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[j] = nums1[p1--];
            } else {
                nums1[j] = nums2[p2--];
            }
        }
    }
}