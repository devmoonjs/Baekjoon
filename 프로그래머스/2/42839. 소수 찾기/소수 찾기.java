import java.util.*;

class Solution {
    HashSet<Integer> numbersSet = new HashSet<>();
    
    public void recursive(String comb, String others) {
        if (!comb.equals("")) {
            numbersSet.add(Integer.valueOf(comb));
        }
        
        for (int i = 0; i < others.length(); i++) {
            recursive(comb + others.charAt(i), 
                      others.substring(0,i) + others.substring(i + 1));
        }
    }
    public int solution(String numbers) {
        int answer = 0;
        recursive("", numbers);
        System.out.println(numbersSet);
        return answer;
    }
}