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
        q.add(new Point(index, sum));
        
        while(!q.isEmpty()){
            Point temp = q.poll();
            
            // index가 numbers.length에 도달하면 검사
            if (temp.index == numbers.length) {
                if (temp.sum == target) {
                    answer++;
                }
                // continue; // 더 이상 탐색하지 않도록 continue
            }
            
            // index가 numbers.length를 넘지 않는 경우에만 큐에 추가
            if (temp.index < numbers.length) {
                q.add(new Point(temp.index + 1, temp.sum + numbers[temp.index]));
                q.add(new Point(temp.index + 1, temp.sum - numbers[temp.index]));
            }
        }
    }
    
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        answer = 0;
        bfs(0, 0);
        return answer;
    }
}
