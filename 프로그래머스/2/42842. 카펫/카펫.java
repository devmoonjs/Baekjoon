class Solution {
    public int[] solution(int brown, int yellow) {
        int hap = brown + yellow;
        int x = 0;
        int y = 0;
        for (int i = 3; i < hap - 2; i++) {
            if (hap % i == 0) {
                y = hap / i;
                
                if (i >= y && (i-2) * (y-2) == yellow) {
                x = i;
                break;
                }
            }
        }
        return new int[]{x, y};
    }
}