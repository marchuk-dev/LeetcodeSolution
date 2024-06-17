package michael.solution;

// https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=top-interview-150
class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        int sStart = 0;
        int tStart = 0;
        while (sStart < s.length() && tStart < t.length()) {
            if (s.charAt(sStart) == t.charAt(tStart)) {
                sStart++;
                tStart++;
            } else {
                tStart++;
            }
        }
        return sStart == s.length();
    }
}