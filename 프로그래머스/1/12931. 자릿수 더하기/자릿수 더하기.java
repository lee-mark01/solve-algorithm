import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n > 0){
            answer += n%10;
            n /= 10;
        }
        return answer;
    }
}

// 10으로 나눈 몫으로 1의자리 떼내고, 나머지는 더하는 방식