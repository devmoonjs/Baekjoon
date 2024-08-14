import java.util.*;

class Solution {
    public long solution(long n) {
        
        double temp = Math.sqrt(n);
        if(temp == Math.round(temp)) {
            return (long)((temp+1) * (temp+1));
        } else {
            return -1;
        }
    }
}
