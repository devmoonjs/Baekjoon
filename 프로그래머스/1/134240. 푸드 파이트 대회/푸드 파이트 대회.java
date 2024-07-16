// 스택?
// 칼로리가 낮은 음식을 먼저 먹을 수 있게
// 음식의 개수가 2의 배수이면 그냥 넣고, 안된다면 몫의 개수만큼만 넣는다. 
// 다 넣으면 0을 출력
// 그리고 이제 다시 빼기

import java.util.*;
import java.io.*;

class Solution {
    public String solution(int[] food) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int r = food[i] / 2;
            for (int j = 0; j < r; j++) {
                stack.push(i);
                sb.append(i);
            }
        }
        sb.append(0);
        
        while(!stack.isEmpty()) {
            String str = stack.pop().toString();
            sb.append(str);
        }
        return sb.toString();
        
    }
}