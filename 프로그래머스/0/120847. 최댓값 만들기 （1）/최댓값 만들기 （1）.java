import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int max = numbers.length;
        int answer = 0;
        Arrays.sort(numbers);
        return answer = numbers[max-1] * numbers[max-2];
    }
}

// 가장 큰수와 그 다음 큰수가 필요한 거네.
// for 문 돌면서 찾아도 되는데, 그냥 배열에서 max 찾고, 그 다음 max 찾는 법 없나? 아니면 그냥 정렬하고 뒤에서 1,2값
