import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        class Flower {
            int start, end;

            public Flower(int start, int end) {
                this.start = start;
                this.end = end;
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Flower> flowers = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int startM = Integer.parseInt(st.nextToken());
            int startD = Integer.parseInt(st.nextToken());
            int endM = Integer.parseInt(st.nextToken());
            int endD = Integer.parseInt(st.nextToken());

            int start = startM * 100 + startD;
            int end = endM * 100 + endD;

            flowers.add(new Flower(start, end));
        }

        // 꽃의 피는 시기 -> 오름차순 | 꽃이 지는 시기 -> 내림차순
        flowers.sort((f1, f2) -> {
            if (f1.start != f2.start) return f1.start - f2.start;
            return f2.end - f1.end;
        });

        int currentDay = 301;
        int lastDay = 1130;
        int maxEnd = 0;
        int count = 0;
        int idx = 0;

        while (currentDay <= lastDay) {
            boolean find = false;

            while (idx < N && flowers.get(idx).start <= currentDay) {
                maxEnd = Math.max(maxEnd, flowers.get(idx).end);
                idx++;
                find = true;
            }

            if (!find) {
                System.out.println(0);
                return;
            }

            count++;
            currentDay = maxEnd;
        }

        System.out.println(count);
    }
}
