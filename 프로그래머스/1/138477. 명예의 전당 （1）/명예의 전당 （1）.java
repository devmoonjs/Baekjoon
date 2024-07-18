// 명에의 전당 list에 추가 하기로
// 리스트가 꽉 찰 때까지 넣는데, 최솟값으로 넣어야 됨
// 꽉 찼으면, 최솟값과 비교해서 클 때 추가
// 제일 작은 값은 출력(계속)
// 우선순위 큐 활용
// 값이 들어갈 때 값이 다 안 찼으면 계속 삽입 -> q.peek()
// 값이 들어갈 때 값이 다 찼다면, 최소 값과 비교하여 작다면 pass -> q.peek()
//                                        크다면 하나 빼고 add -> q.peek()
import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();
        
        for (int s : score) {
            if (q.size() != k) {
                q.add(s);
                sb.append(q.peek()).append(" ");
            } else {
                if (s < q.peek()){
                    sb.append(q.peek()).append(" ");
                } else {
                    q.poll();
                    q.add(s);
                    sb.append(q.peek()).append(" ");
                }
            }
        }
        StringTokenizer st = new StringTokenizer(sb.toString());
        int[] answer = new int[st.countTokens()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(st.nextToken());
        }
        return answer;
    }
}