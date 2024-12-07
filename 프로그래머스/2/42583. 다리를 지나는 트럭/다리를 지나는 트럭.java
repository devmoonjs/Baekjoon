import java.io.*;
import java.util.*;

class Solution {
    
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int sum = 0;
        int time = 0;

        for (Integer truck : truck_weights) {
            while (true) {
                time++;

                // 다리가 찼을 경우
                if (bridge.size() == bridge_length) {
                    sum -= bridge.poll();
                }

                // 트럭이 추가 가능하다면
                if (sum + truck <= weight) {
                    bridge.add(truck);
                    sum += truck;
                    break;
                }
                // 자리는 있지만, 더 이상 들어갈 수 없을 때
                else {
                    // 4. 트럭을 추가할 수 없으면 자리는 비워 둠
                    bridge.add(0); // 이 부분 생략 가능
                }
            }
        }
        return time + bridge_length;
    }
}