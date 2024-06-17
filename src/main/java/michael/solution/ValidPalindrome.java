package michael.solution;

// https://leetcode.com/problems/valid-palindrome/description/?envType=study-plan-v2&envId=top-interview-150
class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().strip().replace(" ", "").replaceAll("[^a-zA-Z0-9]","");
        String reversed = new StringBuilder(s).reverse().toString();
        return reversed.equals(s);
    }
}