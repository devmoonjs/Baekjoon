import java.util.*;

class Solution {
    public int solution(int num1, int num2) {
        double result = (double)num1 / (double)num2 * 1000;
        return (int)Math.floor(result);
    }
}