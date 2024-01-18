import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String[][] clothes){
        int answer = 1;
        Map<String, Integer> map = new HashMap<String, Integer>();

        for(String[] cloth : clothes){
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
        }
        for (Integer value : map.values()){
            answer = answer * (value + 1);
        }
        return answer - 1;
    }
}