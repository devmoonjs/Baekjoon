import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        Queue<Double> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < speeds.length; i++) {
            double temp = Math.ceil((100 - progresses[i]) / (double)speeds[i]);
            q.add(temp);
        }
        
        int cnt = 1;
        double temp = q.poll();
        while(!q.isEmpty()){
            double next = q.peek();
            if (temp >= next) {
                cnt++;
                q.poll();
            } else {
                list.add(cnt);
                cnt = 1;
                temp = q.poll();
            }
        }
        list.add(cnt);
        
        return list;
    }
}