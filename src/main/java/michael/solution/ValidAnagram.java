package michael.solution;

import java.util.*;

// https://leetcode.com/problems/valid-anagram/
class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        Map<Integer, Integer> map = new HashMap<>();
        s.chars().forEach(ch -> map.put(ch, map.getOrDefault(ch, 0) + 1));
        t.chars().forEach(ch -> map.put(ch, map.getOrDefault(ch, 0) - 1));
        return map.values().stream().allMatch(x -> x == 0);
    }
}