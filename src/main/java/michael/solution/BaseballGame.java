package michael.solution;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

// https://leetcode.com/problems/baseball-game/description/?envType=study-plan-v2&envId=programming-skills
class BaseballGame {
    public int calPoints(String[] operations) {
        Deque<Integer> scores = new LinkedList<>();
        for (String operation : operations) {
            try {
                Integer number = Integer.valueOf(operation);
                scores.add(number);
            } catch (NumberFormatException e) {
                if (Objects.equals(operation, "C")) {
                    scores.remove(scores.getLast());
                } else if (Objects.equals(operation, "D")) {
                    scores.add(scores.getLast() * 2);
                } else if (Objects.equals(operation, "+")) {
                    int last = scores.pollLast();
                    int secondLast = scores.peekLast();
                    scores.addLast(last);
                    scores.addLast(last + secondLast);
                }
            }
        }
        return scores.stream()
                .mapToInt(Integer::intValue).sum();
    }
}