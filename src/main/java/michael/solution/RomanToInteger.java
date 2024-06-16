package michael.solution;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/roman-to-integer/description/?envType=study-plan-v2&envId=top-interview-150
class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> roman = createRoman();
        int result = roman.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; i--) {
            if (roman.get(s.charAt(i)) >= roman.get(s.charAt(i + 1))) {
                result += roman.get(s.charAt(i));
            } else {
                result -= roman.get(s.charAt(i));
            }
        }
        return result;
    }

    private static Map<Character, Integer> createRoman() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }

}