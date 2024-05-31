package michael.solution;

// https://leetcode.com/problems/powx-n/?envType=study-plan-v2&envId=programming-skills
class Pow {
    public double myPow(double x, int n) {
        double val = n *  Math.log(x);
        return Math.exp(val);
    }
}