/**
 *  1. Stack 사용
 *  2. 일단, for (N만큼 반복) {
 *      들어올 때마다, top 과 비교해서 top 이 더 작으면 pop(),
 *      if (stack 이 비었다면,) append("0")
 *      else append(top.index); stack.push(new top(i, height));
 * } 
 * }
 */
import java.util.*;
import java.io.*;

public class Main {

    private static class Point {
        int index;
        int height;
        Point(int index, int height) {
            this.index = index;
            this.height = height;
        }
    }

    public static void main(String[] args) throws IOException {
        Stack<Point> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            int nowHeight = Integer.parseInt(st.nextToken());
            if (stack.isEmpty()) {
                stack.push(new Point(i, nowHeight));
                sb.append("0 ");
            } else {
                while(!stack.isEmpty() && stack.peek().height < nowHeight) {
                    stack.pop();
                }

                if (stack.isEmpty()) {
                    stack.push(new Point(i, nowHeight));
                    sb.append("0 ");
                } else if (stack.peek().height >= nowHeight) {
                    sb.append(stack.peek().index).append(" ");
                    stack.push(new Point(i, nowHeight));
                }
            }
        }
        System.out.println(sb.toString());
    }
}