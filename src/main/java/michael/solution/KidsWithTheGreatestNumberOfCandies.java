package michael.solution;

import java.util.*;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75
class KidsWithTheGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int[] clone = candies.clone();
        int max = Arrays.stream(clone)
                .max().getAsInt();
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                result.add(true);
            } else result.add(false);
        }
        return result;
    }
}