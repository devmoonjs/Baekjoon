// dfs()
import java.util.*;

class Solution {
    
    static Set<String> set = new LinkedHashSet<>();
    
    
    private static void dfs(String str, String words) {
        if (str.length() == 6) return;
        if (!str.isEmpty()) set.add(str);
        for (int i = 0; i < 5; i++) {
            dfs(str + words.charAt(i), words);
        }
    }
    public int solution(String word) {
        String words = "AEIOU";
        dfs("", words);
        
        Iterator<String> it = set.iterator();
        int cnt = 0;
        while(it.hasNext()) {
            cnt += 1;
            if (it.next().equals(word)) break;
        }
        
        return cnt;
    }
}