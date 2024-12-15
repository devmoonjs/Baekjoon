import java.util.*;

class Solution {
    
    static HashSet<Integer> set = new HashSet<>();
    
    public static void recursive(String comb, String others) {
        if (comb != "") set.add(Integer.parseInt(comb));
        
        for (int i = 0; i < others.length(); i++) {
            recursive(comb + others.charAt(i), others.substring(0,i) + others.substring(i+1));
        }
    }
    
    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) return false;
        
        int temp = (int)Math.sqrt(num);
        for (int i = 2; i <= temp; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    } 
    
    public int solution(String numbers) {
        recursive("", numbers);
        
        int cnt = 0;
        
        for (Integer temp : set) {
            if (isPrime(temp)) cnt++;
        }
        return cnt;
    }
}