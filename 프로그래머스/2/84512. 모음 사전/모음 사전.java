import java.util.*;

class Solution {
    
    static Set<String> set = new LinkedHashSet<>();
    static String words = "AEIOU";
    // static String word;
    
    private static void dfs(String str, String word) {
        if (!str.isEmpty()) set.add(str);
        if (str.length() == 5) return;
        for (int i = 0; i < words.length(); i++) {
            dfs(str + words.charAt(i), word);
        }
    }
    public int solution(String word) {
        dfs("", words);
        
        Iterator<String> it = set.iterator();
        
        int cnt = 0;
        while(it.hasNext()) {
            cnt += 1;
            if (it.next().equals(word)) {
                break; 
            }
        }
        return cnt;
    }
}