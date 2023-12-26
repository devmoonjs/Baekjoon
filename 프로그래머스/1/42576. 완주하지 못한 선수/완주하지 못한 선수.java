import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Solution{
	
	public String solution(String[] participant, String[] completion) {
		
		String answer = "";
		HashMap<String, Integer> h1 = new HashMap<String, Integer>();
		for(String player: participant) {
			h1.put(player, h1.getOrDefault(player, 0) + 1);
		}
		for(String player: completion) {
			h1.put(player, h1.get(player) -1 );
		}
		for (String key : h1.keySet()){
			if (h1.get(key) != 0) {
				answer = key;
				break;
			}
		}
		return answer;
	}
}