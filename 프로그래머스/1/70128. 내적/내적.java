// 9:5 ~ 9:10
// 각 인덱스끼리 곱하고 누적합을 구한다.

class Solution {
    public int solution(int[] a, int[] b) {
        
        int sum = 0;
        
        for (int i = 0; i < a.length; i++) {
            sum += a[i] * b[i];
        }
        return sum;
    }
}