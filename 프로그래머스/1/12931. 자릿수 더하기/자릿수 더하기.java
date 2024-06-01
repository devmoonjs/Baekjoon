import java.util.*;
import java.io.*;

public class Solution {
    public int solution(int n) {
        
        String temp = String.valueOf(n);
        
        int sum = 0;
        
        for (int i = 0 ; i < temp.length(); i++) {
            sum += Integer.valueOf(temp.charAt(i) - '0');
        }
         return sum;
    }
}