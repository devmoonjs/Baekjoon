/// 9:26 ~ 9:40
import java.util.*;
import java.io.*;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        int newSize = phone_number.length() - 4;
        answer = phone_number.substring(newSize);
        
        for (int i = 0; i < newSize; i++) {
            sb.append("*");
        }
        
        return sb.toString().concat(answer);
    }
}