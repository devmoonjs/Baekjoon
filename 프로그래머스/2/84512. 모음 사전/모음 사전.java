/*
    HashSet<String> set = new HashSet<>();
    
    dfs(String temp, int index) {
        
    }

*/
import java.util.*;

class Solution {
    
    static String str;
    static HashSet<String> set = new LinkedHashSet<>();
    
    private static void dfs(String comb) {
        if (comb.length() == 6) return;
        if (comb != "") set.add(comb);
        
        for (int i = 0; i < str.length(); i++) {
            dfs(comb + str.charAt(i));
        }
    }
    
    public int solution(String word) {
        str = "AEIOU";
        dfs("");
        
        Iterator<String> it = set.iterator();
        int index = 0;
        while(it.hasNext()) {
            index++;
            if (it.next().equals(word)) break;
        }
        
        return index;
    }
}