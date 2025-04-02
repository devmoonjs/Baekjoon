import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        // String[] answer = {};
        
        Arrays.sort(strings, new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                char c1 = o1.charAt(n);
                char c2 = o2.charAt(n);
                
                if (c1 == c2) {
                    return o1.compareTo(o2);
                }
                
                return Character.compare(c1, c2);
            }
        });
        
        for (String s : strings) {
            System.out.println(s);
        }
        
        
        return strings;
    }
}