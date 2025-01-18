import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        HashSet<String> used = new HashSet<>();
        char lastChar = words[0].charAt(0);
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (used.contains(word) || lastChar != word.charAt(0)) {
                return new int[] {i % n + 1, i / n + 1};
            }
            
            used.add(word);
            lastChar = word.charAt(word.length() - 1);
        }
        
        return new int[] {0,0};
    }
}