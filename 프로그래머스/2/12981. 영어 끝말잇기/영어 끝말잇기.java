/*
    int round = 1;
    int nowPerson = 1;
    for (words 전체 i) {
        String preLastWord = words[i-1]
        Char preLastChar = preLastWord.charAt(preLastWord.length()-1);
        
        String nowWord = words[i];
        
        if (nowWord.charAt(0) != preLastChar || wordList.contains(nowWord))
        {
            break;
        }
        
        if (nowPerson == n) {
            nowPerson = 1;
            round++;
        } else {
            nowPerson++;
        }
    }
*/

import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        HashSet<String> wordsSet = new HashSet<>();
        wordsSet.add(words[0]);
        
        int round = 1;
        int nowPerson = 2;
        boolean fail = false;
        
        for (int i = 1; i < words.length; i++) {
            String preWord = words[i-1];
            Character preLastChar = preWord.charAt(preWord.length() - 1);
            
            String nowWord = words[i];
            
            if (nowWord.charAt(0) != preLastChar || wordsSet.contains(nowWord)) {
                fail = true;
                break;
            }
            
            wordsSet.add(nowWord);
            if (nowPerson == n) {
                nowPerson = 1;
                round++;
            } else {
                nowPerson++;
            }
        }
        
        if (fail) {
            return new int[]{nowPerson, round};
        }
        
        return new int[]{0,0};
    }
}