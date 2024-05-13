package michael.solution;

// https://leetcode.com/problems/robot-bounded-in-circle/description/?envType=study-plan-v2&envId=programming-skills
class RobotBoundedInCircle {
    public boolean isRobotBounded(String instructions) {
        int x = 0, y = 0;
        int direction = 0;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for (char inst : instructions.toCharArray()) {
            if (inst == 'G') {
                x += directions[direction][0];
                y += directions[direction][1];
            } else if (inst == 'L') {
                direction = (direction + 3) % 4;
            } else if (inst == 'R') {
                direction = (direction + 1) % 4;
            }
        }
        return (x == 0 && y == 0) || direction != 0;
    }
}