// 알파벳 조합으로 사전을 만든다. 
// 길이는 5를 넘지 않으며,
// 주어진 단어의 인덱스 값을 return 하자.
// 조합 -> 재귀 dfs 활용
import java.util.*;

class Solution {
    
    static Set<String> set = new LinkedHashSet<>();
    static String str; 
    
    private static void dfs(String comb, String str) {
        if (comb.length() == 6) return;
        if (comb != "") set.add(comb);
        
        for (int i = 0; i < str.length(); i++) {
            dfs(comb + str.charAt(i), str);
        }
    }
    
    public int solution(String word) {
        str = "AEIOU";
        dfs("", str);
        
        Iterator<String> it = set.iterator();
        
        int index = 0;
        while(it.hasNext()) {
            index++;
            if (it.next().equals(word)) break;
        }
        
        return index;
    }
}