class Solution {
    public String solution(int n) {
        String target = "수박";
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            sb.append(target.charAt(i%2));
        }
        return sb.toString();
    }
}