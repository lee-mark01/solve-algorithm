import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int len = nums.length;
        Set<Integer> set = new HashSet<>();
        int answer = 0;
        for (int i = 0; i < len; i++){
            set.add(nums[i]);
        }
        int setSize = set.size();
        if (setSize < len/2){
            answer = setSize;
        } else {
            answer = len/2;
        }
        return answer;
    }
}
