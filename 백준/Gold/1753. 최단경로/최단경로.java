import java.io.*;
import java.util.*;

public class Main {
    static class Node implements Comparable<Node> {
        int vertex, weight;

        Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node other) {
            return this.weight - other.weight;  // 가중치 기준 정렬 (최소 힙)
        }
    }

    public static int[] dijkstra(int V, int K, ArrayList<Node>[] graph) {
        int[] distance = new int[V + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[K] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(K, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();

            if (distance[current.vertex] < current.weight) {
                continue;
            }

            for (Node next : graph[current.vertex]) {
                int cost = distance[current.vertex] + next.weight;

                if (cost < distance[next.vertex]) {
                    distance[next.vertex] = cost;
                    pq.offer(new Node(next.vertex, cost));
                }
            }
        }
        return distance;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());

        ArrayList<Node>[] graph = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph[u].add(new Node(v, w));
        }

        int[] result = dijkstra(V, K, graph);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= V; i++) {
            if (result[i] == Integer.MAX_VALUE) {
                sb.append("INF\n");
            } else {
                sb.append(result[i]).append("\n");
            }
        }
        System.out.print(sb);
    }
}
