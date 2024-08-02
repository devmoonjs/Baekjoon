// 한 칸씩 넘기는데
// 만약, 소문자라면 122이 넘어갈 때 넘어가는 수 - a
// 만약, 대문자라면 90 넘어가는 수 - A
// 만약 공백이라면 패스 (" ")

class Solution {
    public String solution(String s, int n) {
        char[] temp = new char[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            char c = (char)s.charAt(i);
            if (c == ' ') {
                temp[i] = ' ';
                continue;
            }
            if (Character.isLowerCase(c)) {
                if (c + n > 122) {
                    temp[i] = (char)(c + n - 26);
                } else {
                    temp[i] = (char)(c + n);
                }
            } else {
                if (c + n > 90) {
                 temp[i] = (char)(c + n - 26);
                } else {
                    temp[i] = (char)(c + n);
                }   
            
            }
        }
        return String.valueOf(temp);
    }
}