package michael.solution;

// https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75
class GreatestCommonDivisorOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        String bigger = str1.length() > str2.length() ? str1 : str2;
        String smaller = str1.length() > str2.length() ? str2 : str1;
        if (bigger.equals(smaller)) {
            return bigger;
        }
        if (!bigger.startsWith(smaller)) {
            return "";
        }
        return gcdOfStrings(bigger.substring(smaller.length()), smaller);
    }
}