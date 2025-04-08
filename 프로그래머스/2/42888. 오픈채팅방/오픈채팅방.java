/*
    일단,
    HashMap<String, String> idNick = new HashMap<>();
    for (String rec : record) {
        String[] command = rec.split(" ");
        if (command[0].equals("Enter") || command[1].equals("Change")) {
            idNick.put(command[1], command[2]);
        }
    }
*/
import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> idNick = new HashMap<>();
        for (String rec : record) {
            String[] command = rec.split(" ");
            if (!command[0].equals("Leave")) idNick.put(command[1], command[2]);
        }
        
        List<String> list = new ArrayList<>();
        for (int i = 0; i < record.length; i++) {
            String[] sen = record[i].split(" ");
            if (sen[0].equals("Enter")) {
                list.add(idNick.get(sen[1]) + "님이 들어왔습니다.");
            }
            
            else if (sen[0].equals("Leave")) {
                list.add(idNick.get(sen[1]) + "님이 나갔습니다.");
            }
        }
        return list.toArray(new String[0]);
    }
}