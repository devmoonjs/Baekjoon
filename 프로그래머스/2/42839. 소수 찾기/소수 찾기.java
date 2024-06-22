// 8:35 ~ 8:55

import java.util.*;

class Solution {
    
    static HashSet<Integer> set = new HashSet<>();
    
    static private void recursive(String comb, String others) {
        if (comb != "" ) set.add(Integer.valueOf(comb));
        
        for (int i = 0; i < others.length(); i++) {
            recursive(comb + others.charAt(i), others.substring(0,i) + others.substring(i+1));
        }
    }
    
    static private boolean isPrime(int index) {
        if (index == 1 || index == 0) return false;
        int lim = (int)Math.sqrt(index);
        
        for (int i = 2; i <= lim ; i++) {
            if (index % i == 0 ) return false;
        }
        
        return true;
    }
    
    public int solution(String numbers) {
        recursive("", numbers);
        
        int answer = 0;
        
        for (Integer a : set) {
            if (isPrime(a)) answer++;
        }
        return answer;
    }
}