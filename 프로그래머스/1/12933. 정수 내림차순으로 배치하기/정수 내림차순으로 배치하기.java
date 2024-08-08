// n 을 하나하나 잘라서 활용! (String 형으로 바꾸는 것이 좋겠다)
// 각 자릿수 별로 자른 값을 배열에 넣은 뒤 -> 해당 배열을 오름차순 정렬하고 -> 뒤에서 부터 읽으면 최댓값
// 정렬 : Array.sort 활용
// 새로운 정수 만드는 과정 StringBuilder 활용
import java.util.*;

class Solution {
    public long solution(long n) {
        
        String str = Long.toString(n);
        
        int[] arr = new int[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }
        
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        
        for (int i = arr.length - 1 ; i >= 0; i--) {
            sb.append(arr[i]);    
        }
        
        long answer = Long.parseLong(sb.toString());
        return answer;
    }
}