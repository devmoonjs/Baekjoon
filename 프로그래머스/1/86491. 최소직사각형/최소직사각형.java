import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[][] sizes) {
        ArrayList<Integer> aList = new ArrayList<>();
        ArrayList<Integer> bList = new ArrayList<>();
        
        for (int[] arr : sizes){
            int a = Math.max(arr[0], arr[1]);
            int b = Math.min(arr[0], arr[1]);
            aList.add(a);
            bList.add(b);
        }
        
        Collections.sort(aList);
        Collections.sort(bList);
        
        int aMax = aList.get(aList.size()-1);
        int bMax = bList.get(bList.size()-1);
       
        return aMax * bMax;
    }
}