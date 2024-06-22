import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> q = new LinkedList<>();
        int n = priorities.length;
        
        int index = 0;
        for (int p : priorities) {
            q.add(new int[] {p, index++});
        }
        
        Arrays.sort(priorities);
        int max = priorities[n - 1];
        int answer = 0;
        
        int cnt = 0;
        int i = 1;
        while(!q.isEmpty()) {
            int[] temp = q.poll();
            
            if (temp[0] < max) {
                q.add(temp);
            }
            else if (temp[0] == max) {
                cnt++;
                if (temp[1] == location) {
                    answer = cnt;
                    break;
                }
                else {
                    max = priorities[n-1-cnt];
                }
            }
        }
        return answer;
    }
}