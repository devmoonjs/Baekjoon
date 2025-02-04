import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        Queue<String> q = new LinkedList<>();
        boolean[] visited = new boolean[words.length];
        
        int firstCheckCnt = 0;
        for (String str : words) {
            if (str.equals(target)) {
                firstCheckCnt++;
            }
        }
        if (firstCheckCnt == 0) return 0;
        
        q.offer(begin);
        
        while(!q.isEmpty()) {
            for (int i = 0; i < q.size(); i++) {
                String current = q.poll();
                
                if (current.equals(target)) return answer;
                
                for (int j = 0; j < words.length; j++) {
                    if (checkChange(current, words[j]) && !visited[j]) {
                        q.offer(words[j]);
                        visited[j] = true;
                    }
                }
            }
            answer++;
        }
        return answer;
    }
    
    private boolean checkChange(String a, String b) {
        int diff = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                diff++;
            }
        }
        if (diff == a.length() - 1) {
            return true;
        }
        return false;
    }
}