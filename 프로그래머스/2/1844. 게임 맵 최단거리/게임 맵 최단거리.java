import java.util.*;

class Solution {
    
    static int[] dx = {0,1,-1,0};
    static int[] dy = {1,0,0,-1};
    static int[][] maps;
    static int n;
    static int m;
    static Queue<Point> q = new LinkedList<>();
    
    static class Point {
        int x;
        int y;
        
        Point (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    private void bfs(int x, int y) {
        q.add(new Point(x, y));
        
        while (!q.isEmpty()) {
            Point point = q.poll();
            
            for (int i = 0; i < dx.length; i++) {
                int newX = point.x + dx[i];
                int newY = point.y + dy[i];
                
                if (newX >= 0 && newX < n && newY >= 0 && newY < m) {
                    if (maps[newX][newY] == 1) {
                        q.add(new Point(newX, newY));
                        maps[newX][newY] += maps[point.x][point.y];
                    }
                }
            }
        }
    }
    
    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        this.maps = maps;
        
        bfs(0,0);
        int result = maps[n-1][m-1];
        if (result > 1) {
            return result;
        } else {
            return -1;
        }
    }
}