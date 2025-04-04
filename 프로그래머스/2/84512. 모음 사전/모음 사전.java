import java.util.*;

class Solution {
    
    static String str;
    static HashSet<String> set = new LinkedHashSet<>();
    
    static void dfs(String comb) {
        if (comb.length() == 6) return;
        if (comb != "") set.add(comb);
        for (int i = 0; i < str.length(); i++) {
            dfs(comb + str.charAt(i));
        }
    }
    
    public int solution(String word) {
        this.str = "AEIOU";
        dfs("");
        
        int answer = 0;
        
        Iterator<String> it = set.iterator();
        int index = 0;
        while(it.hasNext()) {
            index++;
            if (it.next().equals(word)) break;
        }
        
        return index;
    }
}