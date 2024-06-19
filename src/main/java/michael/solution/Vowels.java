package michael.solution;

import java.util.Arrays;

// https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/java
public class Vowels {
    public static int getCount(String str) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        return (int) Arrays.stream(str.split("")).filter(letter -> Arrays.asList(vowels).contains(letter)).count();
    }

}