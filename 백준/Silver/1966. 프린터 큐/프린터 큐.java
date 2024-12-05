import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    /**
     * 1. 프린터 문서 하나 꺼냄
     * 2. 우선순위 비교해서 지금 가장 높은 우선순위보다 높다면,,
     * 2-0. 위치값이 M 과 같다면 -> posiion 순서를 출력
     * 2-1. 아니라면 일단 출력해서 위치값 positionList 에 넣기
     *
     * 3. 우선순위 비교해서 가장 높은게 아니라면 다시 큐에 삽입
     *     q.ad(tmemp = temp.str)
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            // N, M 입력
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Queue<Star> q = new LinkedList<>();
            List<Integer> bigList = new ArrayList<>();

            // 우선순위 입력
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int index = Integer.parseInt(st1.nextToken());
                Star star = new Star(i, index);
                q.add(star);
                bigList.add(index);
            }

            // 우선순위 정렬
            Collections.sort(bigList);
            int now = 1;
            int nowMax = bigList.get(bigList.size() - 1);
            int maxCnt = 1;

            while (!q.isEmpty()) {
                int listSize = bigList.size();
                Star tempStar = q.poll();

                if (tempStar.imp >= nowMax) {
                    if (tempStar.number == M) {
                        System.out.println(now);
                        break;
                    } else {
                        maxCnt++;
                        now++;
                        nowMax = bigList.get(listSize - maxCnt);
                    }
                } else {
                    q.add(tempStar);
                }
            }
        }
    }

    static class Star {
        int number;
        int imp;

        public Star(int number, int imp) {
            this.number = number;
            this.imp = imp;
        }
    }
}
