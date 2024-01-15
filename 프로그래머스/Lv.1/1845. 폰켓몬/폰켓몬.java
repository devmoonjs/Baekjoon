import java.io.IOException;
import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        
        int choose = nums.length/2;
        nums = Arrays.stream(nums).distinct().toArray();

        int result = nums.length;

        if(choose>result){
            return result;
        }
        return choose;
    }
}