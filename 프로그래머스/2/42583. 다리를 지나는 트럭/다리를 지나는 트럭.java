import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        Queue<Integer> bridge = new LinkedList<>();
        int sum = 0;
        int time = 0;

        for (int i = 0; i < truck_weights.length; i++) {
            int truck = truck_weights[i];

            while (true) {
                if (bridge.isEmpty()) {
                    bridge.add(truck);
                    sum += truck;
                    time++;
                    break;
                } else if (bridge.size() == bridge_length) { // 다리에 트럭이 전부 찬 경우
                    sum -= bridge.poll();
                } else { // 다리에 트럭 자리가 남았을 때
                    if (sum + truck <= weight) {
                        bridge.add(truck);
                        sum += truck;
                        time++;
                        break;
                    } else {
                        bridge.add(0);
                        time++;
                    }
                }
            }
        }
        int result =time + bridge_length;
        return result;
    }
}