/*
    최소공배수 구하기
*/

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        int temp = lcm(arr[0], arr[1]);
        
        for (int i = 2; i < arr.length; i++) {
            temp = lcm(temp, arr[i]);
        }
        
        answer = temp;
        return answer;
    }
    
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    public int lcm(int a, int b) {
        return (a * b) / gcd(a , b);
    }
}
