package michael.solution;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75
class ReverseVowelsOfString {
    public static String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        List<Character> vowelsFromString = new ArrayList<>();
        List<Integer> indexesOfVowels = new ArrayList<>();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (vowels.indexOf(Character.toLowerCase(charArray[i])) != -1) {
                vowelsFromString.add(charArray[i]);
                indexesOfVowels.add(i);
            }
        }
        Queue<Character> reversed = new ArrayDeque<>(vowelsFromString.reversed());
        indexesOfVowels.forEach(index -> {
            if (vowels.indexOf(Character.toLowerCase(charArray[index])) != -1) {
                charArray[index] = reversed.poll();
            }
        });
        return new String(charArray);
    }
}