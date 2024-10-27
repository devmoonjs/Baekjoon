import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        
        int days = 28; // 한 달 날짜
        
        int todayY = Integer.parseInt(today.substring(0,4));
        int todayM = Integer.parseInt(today.substring(5,7));
        int todayD = Integer.parseInt(today.substring(8,10));

        int totalD = (todayY*days*12) + (todayM*28) + todayD; // 오늘 날짜 환산
        
        List<Integer> answer = new ArrayList<>();
        HashMap<Character,Integer> termsMap = new HashMap<>();
        
        for(String term : terms){
            char termO = term.charAt(0);
            int termM = Integer.parseInt(term.substring(2));
            termsMap.put(termO,termM);
        }
        
        for(int i=0; i<privacies.length; i++){
            
            char privacyO = privacies[i].charAt(11);
            int privacyY = Integer.parseInt(privacies[i].substring(0,4));
            int privacyM = Integer.parseInt(privacies[i].substring(5,7));
            int privacyD = Integer.parseInt(privacies[i].substring(8,10));
            
            int totalPrivacyD = (privacyY*12*days) + (privacyM*days) + privacyD;
            int termM = termsMap.get(privacyO);
            int termDay = termM * days;
            
            if(totalPrivacyD + termDay <= totalD){ // 오늘과 비교하여 지났다면 추가
                answer.add(i+1);
            }
        }

        return answer;
    }
}
            