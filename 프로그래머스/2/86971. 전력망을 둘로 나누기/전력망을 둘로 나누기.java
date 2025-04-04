// 송전탑의 간선 정보를 이용해 -> 그래프로 바꾸고
// 모든 간선에 대한 경우의 수 중 어떤 간선을 끊어야 전력망의 차가 최소가 되는지
// 1. ArrayList<Integer>[] list = new ArrayList<>();
//    n의 개수만큼 빈 리스트 생성 (n+1) 로 만들자
// wires(간선)의 수 만큼 반복하여 해당하는 간선을 그래프에서 삭제하고 -> bfs 하고 -> 다시 추가하는 방식
// bfs 로직 안에서 노드의 수를 계산 (poll() 할 때마다 count)
// dfs 먼저 구현해보기

import java.util.*;

class Solution {
    
    static ArrayList<Integer>[] graph;
    static int cnt = 0;
    static boolean[] checked;
    
    static void dfs(int index) {
        cnt++;
        checked[index] = true;
        for (int next : graph[index]) {
            if (!checked[next]) {
                dfs(next);
            }
        }
    }
    
    public int solution(int n, int[][] wires) {
        graph = new ArrayList[n+1];
        
        for (int i = 1; i < n+1; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < wires.length; i++) {
            int a = wires[i][0];
            int b = wires[i][1];
            
            graph[a].add(b);
            graph[b].add(a);
        }
        
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < wires.length; i++) {
            int in = wires[i][0];
            int out = wires[i][1];
            
            graph[in].remove(Integer.valueOf(out));
            graph[out].remove(Integer.valueOf(in));
            
            checked = new boolean[n+1];
            cnt = 0;
            
            dfs(1);
            
            int diff = Math.abs(n - cnt - cnt);
            min = Math.min(diff, min);
            
            graph[in].add(out);
            graph[out].add(in);
        }
        
        return min;
    }
}