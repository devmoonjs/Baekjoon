import java.util.*;

class Solution {
    
   static class Point{
       int a;
       int b;
       
       Point(int a, int b) {
           this.a = a;
           this.b = b;
       }
   } 
    
    static int[][] maps;
    static int N;
    static int M;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static boolean[][] check;
    
    private static void bfs(int a, int b){
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(a,b));
        check[a][b] = true;
        
        while(!q.isEmpty()){
            Point temp = q.poll();
            for (int i = 0; i < 4; i++) {
                int newA = temp.a + dx[i];
                int newB = temp.b + dy[i];
                
                if (newA >= 0 && newA < N && newB >= 0 && newB < M && maps[newA][newB] == 1 && !check[newA][newB]){
                    q.add(new Point(newA, newB));
                    check[newA][newB] = true;
                    maps[newA][newB] = maps[temp.a][temp.b] + 1;
                }
            }
        }
    }
    
    public int solution(int[][] maps) {
        this.maps = maps;
        N = maps.length;
        M = maps[0].length;
        check = new boolean[N][M];
        bfs(0,0);
        
        int result = maps[N-1][M-1];
        if (result == 1) {
            return -1;
        } else {
            return result;
        }
    }
}