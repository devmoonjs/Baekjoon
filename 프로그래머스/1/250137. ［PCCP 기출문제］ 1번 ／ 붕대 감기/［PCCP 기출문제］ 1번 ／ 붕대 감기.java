class Solution {
    
    public static boolean isDied(int hp) {
        return hp <= 0;
    }
    
    public int solution(int[] bandage, int health, int[][] attacks) {
        int endTime = attacks[attacks.length-1][0];
        int attackIndex = 0;
        int jisok = 0;
        int hp = health;
        
        for (int time = 1; time <= endTime; time++) {
            // 공격 당함
            if (attacks[attackIndex][0] == time) {
                hp -= attacks[attackIndex][1];
                
                if(isDied(hp)) {
                    return -1;
                }
                
                attackIndex++;
                jisok = 0;
                
            }
            
            // 공격 안 당함
            else {
                if (hp < health) {
                    jisok++;
                    hp += bandage[1];
                    
                    if (jisok == bandage[0]) {
                        hp += bandage[2];
                        jisok = 0;
                    }
                    
                    hp = Math.min(hp, health);
                } else {
                    jisok = 0;
                }
            }
        }
        return hp;
    }
}