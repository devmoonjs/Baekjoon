import java.util.*;

class Solution {
    public int solution(int n, int[][] costs) {
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        
        Arrays.sort(costs, (a,b) -> Integer.compare(a[2], b[2]));
        int totalPay = 0;
        
        for (int[] cost : costs) {
            int from = cost[0];
            int to = cost[1];
            int pay = cost[2];
            
            if (find(parent, from) != find(parent, to)) {
                union(parent, from, to);
                totalPay += pay;
            }
        }
        
        return totalPay;
    }
    
    private int find(int[] parent, int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent, parent[x]);
    }
    
    private void union(int[] parent, int x, int y) {
        int rootX = find(parent, x);
        int rootY = find(parent, y);
        
        if (rootX != rootY) {
            parent[rootY] = rootX;
        }
    }
}