import java.util.HashMap;
import java.util.Collections;
import java.util.Map;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        
        Map<String, Map<String, Integer>> giftRecords = new HashMap<>(); // 각 친구가 다른 친구에게 준 선물을 기록
        Map<String, Integer> giftScore = new HashMap<>(); // 각 친구의 선물 점수 (선물 준 사람은 +1, 받은 사람은 -1)
        Map<String, Integer> nextMonthGifts = new HashMap<>(); // 다음 달에 받을 선물 수를 저장하는 맵

        // 모든 친구들의 초기 선물 기록과 점수, 다음 달 선물 수를 0으로 초기화
        for (String friend : friends) {
            giftRecords.put(friend, new HashMap<>()); // 선물 기록 초기화
            giftScore.put(friend, 0);                // 선물 점수 초기화
            nextMonthGifts.put(friend, 0);           // 다음 달 선물 수 초기화
        }

        // 선물 기록 업데이트
        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            String giver = parts[0];                 // 선물 준 사람
            String receiver = parts[1];              // 선물 받은 사람

            // 준 사람의 선물 기록을 업데이트
            giftRecords.get(giver).put(receiver, giftRecords.get(giver).getOrDefault(receiver, 0) + 1);
            
            // 준 사람의 점수를 +1, 받은 사람의 점수를 -1로 업데이트
            giftScore.put(giver, giftScore.get(giver) + 1);
            giftScore.put(receiver, giftScore.get(receiver) - 1);
        }

        // 각 친구가 다음 달에 받을 선물 수 계산
        for (String giver : friends) {
            for (String receiver : friends) {
                if (!giver.equals(receiver)) { // 자기 자신에게는 선물 줄 수 없음
                    
                    // `giver`가 `receiver`에게 준 선물 수
                    int giftsFromGiver = giftRecords.get(giver).getOrDefault(receiver, 0);
                    
                    // `receiver`가 `giver`에게 준 선물 수
                    int giftsFromReceiver = giftRecords.get(receiver).getOrDefault(giver, 0);

                    // `giver`가 더 많이 선물을 줬으면, 다음 달에 받을 선물 수 +1
                    if (giftsFromGiver > giftsFromReceiver) {
                        nextMonthGifts.put(giver, nextMonthGifts.get(giver) + 1);
                    }
                    // 만약 선물 수가 동일하고, `giver`의 선물 점수가 더 높으면 +1
                    else if (giftsFromGiver == giftsFromReceiver && giftScore.get(giver) > giftScore.get(receiver)) {
                        nextMonthGifts.put(giver, nextMonthGifts.get(giver) + 1);
                    }
                }
            }
        }

        // 다음 달에 가장 많은 선물을 받을 친구가 받는 선물 수 반환
        return Collections.max(nextMonthGifts.values());
    }
}
