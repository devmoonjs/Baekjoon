import java.util.Arrays;
import java.util.StringTokenizer;

class Solution {
    public static String solution(String s) {
		StringTokenizer st = new StringTokenizer(s);
		int[] arr = new int[st.countTokens()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int max = arr[arr.length-1];
		int min = arr[0];
		
		String answer = min + " " + max;
		return answer;
	}
}