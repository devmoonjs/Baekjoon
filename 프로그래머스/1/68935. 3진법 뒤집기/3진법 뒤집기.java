// 45 % 3 = 0
// 15 % 3 = 0
// 5 % 3 = 2
// 1 % 3 == 1

class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        while(n > 0) {
            if (n / 3 != 0) {
                sb.append(n % 3);
                n /= 3;
            } else {
                sb.append(n % 3);
                break;    
            }
        }
        String first = sb.toString();
        int sum = 0;
        int temp = 1;
        for (int i = first.length() - 1; i >= 0; i--) {
            sum += (first.charAt(i) - '0') * temp;
            temp *= 3;
        }
        return sum;
    }
}