import java.util.*;

class Solution {
    
    static int answer;
    static int[] numbers;
    static int target;
    
    static class Point{
        int index;
        int sum;
        
        Point(int index, int sum) {
            this.index = index;
            this.sum = sum;
        }
    }    
    
    private static void bfs(int index, int sum) {
        Queue<Point> q = new LinkedList<>();
        Point p = new Point(index, sum);
        q.add(p);
        
        while(!q.isEmpty()){
            Point temp = q.poll();
            if (temp.index == numbers.length) {
                if (temp.sum == target) {
                    answer++;
                }
            } else {
                q.add(new Point(temp.index+1, temp.sum + numbers[temp.index]));
                q.add(new Point(temp.index+1, temp.sum - numbers[temp.index]));
            }
        }
        
    }
    
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        answer = 0;
        bfs(0,0);
        return answer;
    }
}