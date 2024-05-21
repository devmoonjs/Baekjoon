import java.util.StringTokenizer;
class Solution {
    static String answer;
    public String solution(String s) {
        answer = "";

		// 첫번째 일단 수행
		makeUpper(s.charAt(0));

		for (int i = 1; i < s.length(); i++) {
			char c = s.charAt(i);
			char test = s.charAt(i - 1);

			if (test == ' ' && c!= ' ') {
				makeUpper(c);
			} else if (Character.isUpperCase(c)) {
				c = Character.toLowerCase(c);
				answer += c;
			} else if (c == ' ') {
				answer += c;
			} else {
				answer += c;
			}
		}
		return answer;
	}

	private static void makeUpper(char c) {
		if (Character.isLowerCase(c)) {
			answer += Character.toUpperCase(c);
		} else {
			answer += c;
		}
	}
}