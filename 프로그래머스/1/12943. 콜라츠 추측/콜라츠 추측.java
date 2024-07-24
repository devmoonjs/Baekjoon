// 짝수라면 / 2
// 홀수라면 * 3 + 1
// 1이 될 때까지 반복
// 만약, 작업이 500번 반복 때까지 1이 안되면 -1 출력 (count 변수)

class Solution {
    public int solution(long num) {
        int count = 0;
        boolean answer = true;
        
        while(num > 1) {
            if (count >= 500) {
                answer = false;
                break;
            }
            if (num % 2 == 0) {
                num /= 2;
                count++;
            } else {
                num = num * 3 + 1;
                count++;
            }
        }
        if (answer) {
            System.out.println(count);
            return count;
        } else {
            return -1;
        }
    }
}