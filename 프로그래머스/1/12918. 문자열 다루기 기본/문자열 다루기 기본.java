class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] arr = s.toCharArray();
        // {a, 2, 3, 4}
        if (s.length() == 4 || s.length() == 6) { // 4자리거나 6자리일때
            for (int i = 0; i < s.length(); i++) { // 배열 갯수만큼 실행
                if ('0' <= arr[i] && arr[i] <= '9') {
                    System.out.println(arr[i]);
                    continue;
                } else {
                    answer = false;
                    break;
                }
            }
        } else answer = false;
        return answer; // GG
    }
}