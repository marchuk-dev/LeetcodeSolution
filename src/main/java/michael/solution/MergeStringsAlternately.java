package michael.solution;

// https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75
class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int word1Length = word1.length();
        int word2Length = word2.length();
        int min = Math.min(word1Length, word2Length);
        for (int i = 0; i < min; i++) {
            merged.append(word1.charAt(i)).append(word2.charAt(i));
        }
        if (word1Length == word2Length) return merged.toString();
        else if (word1Length > word2Length) {
            merged.append(word1.substring(min));
        } else {
            merged.append(word2.substring(min));
        }
        return merged.toString();
    }

}

