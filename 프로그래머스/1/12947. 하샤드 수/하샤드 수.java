// 양의 정수 X 의 모든 자릿수의 합을 sum 이라 가정!
// X % sum == 0 인 경우 하샤드 수라고 판별

class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int temp = x;
        
        while(x > 0) {
            sum += x % 10;
            x /= 10;
        }
        
        if (temp % sum == 0) {
            return true;
        } else {
            return false;
        }
    }
}