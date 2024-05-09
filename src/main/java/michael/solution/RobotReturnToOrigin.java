package michael.solution;

// https://leetcode.com/problems/robot-return-to-origin/description/?envType=study-plan-v2&envId=programming-skills
class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        char[] chars = moves.toCharArray();
        int[][] coordinates = {{0}, {0}};
        for (char ch : chars) {
            if (ch == 'U') {
                coordinates[0][0] += 1;
            } else if (ch == 'D') {
                coordinates[0][0] -= 1;
            } else if (ch == 'L') {
                coordinates[1][0] += 1;
            } else if (ch == 'R') {
                coordinates[1][0] -= 1;
            }
        }
        return coordinates[0][0] == 0 && coordinates[1][0] == 0;
    }
}