class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a < b){
            for (int i = a; i<=b; i++){
                answer += i;
            }
        } else if (a == b){
            answer = a;
        } else {
            for (int j = b; j<=a; j++){
                answer += j;
            }
        }
        return answer;
    }
}

// 비교해서 작은 수부터 큰 수까지 반복문 돌면서 다 더하기