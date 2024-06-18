import java.util.*;

class Solution {
    
    static HashSet<Integer> numbersSet = new HashSet<>();
    
    private static void recursive(String comb, String others) {
        if (comb != "") {
            numbersSet.add(Integer.valueOf(comb));
        }
        
        for (int i = 0; i < others.length(); i++ ) {
            recursive(comb + others.charAt(i), others.substring(0,i) + others.substring(i+1));
        }
    }
    
    private static boolean isPrime(int index) {
        if (index == 1 || index == 0) {
            return false;
        }
        
        int lim = (int)Math.sqrt(index);
        
        for (int i = 2 ; i <= lim ; i++) {
            if (index % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    
    public int solution(String numbers) {
        
        recursive("", numbers);
        
        Iterator<Integer> it = numbersSet.iterator();
        
        int answer = 0;
        
        while(it.hasNext()){
            int temp = it.next();
            boolean result = isPrime(temp);
            
            if (result) {
                answer++;
            }
        }
        return answer;
    }
}