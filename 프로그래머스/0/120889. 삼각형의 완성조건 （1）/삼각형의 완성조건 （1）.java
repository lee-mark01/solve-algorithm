import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        if (sides[0]+sides[1] > sides[2]){
            return 1;    
        }else {
            return 2;
        }
        
    }
}

// 가장 큰 수 찾기. 나머지를 더한 걸 비교하기. 정렬? 어짜피 3.