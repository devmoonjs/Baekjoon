// 짝수번째 알파벳은 대문자
// 홀수번째 알파벳은 소문자로

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) { // 일단 문자열 char 배열에 저장
            if (arr[i] == ' '){ // 공백 체크
                cnt = 0;
                continue;
            }
            
            if (cnt % 2 == 0) { // 짝수고 소문자면
                arr[i] = Character.toUpperCase(arr[i]);
                
            } else if (cnt % 2 != 0) { // 홀수고 대문자면
                arr[i] = Character.toLowerCase(arr[i]);
            }
            cnt++;
        }
        answer = String.copyValueOf(arr);
        return answer;
    }
}