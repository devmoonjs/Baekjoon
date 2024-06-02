import java.util.*;
import java.io.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (!stack.isEmpty() && stack.peek() == arr[i]){
                stack.pop();
                stack.add(arr[i]);
            } else {
                stack.add(arr[i]);
            }
        }
        int[] answer = new int[stack.size()];
        for (int i = stack.size(); i > 0; i--) {
            answer[i-1] = stack.pop();
        }

        return answer;
    }
}