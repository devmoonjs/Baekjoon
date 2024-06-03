import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        double[] arr = new double[speeds.length];
        
        for (int i = 0; i < speeds.length; i++) {
            arr[i] = Math.ceil((100 - progresses[i]) / (double)speeds[i]);
        }
        
        Queue<Double> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for (double a : arr) {
            q.add(a);
        }
        
        int cnt = 1;
        double temp = q.poll();
        
        while (!q.isEmpty()) {
            if (temp >= q.peek()) {
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