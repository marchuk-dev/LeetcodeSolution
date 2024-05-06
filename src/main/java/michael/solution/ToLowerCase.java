package michael.solution;

// https://leetcode.com/problems/to-lower-case/description/?envType=study-plan-v2&envId=programming-skills
public class ToLowerCase {
    public String toLowerCase(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++)
            if (Character.isUpperCase(charArray[i])) charArray[i] = Character.toLowerCase(charArray[i]);
        return String.valueOf(charArray);
    }
}
