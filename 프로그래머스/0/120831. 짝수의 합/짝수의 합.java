class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i< n+1; i++){
            if (i%2 == 0){
                answer += i;
            }
        }
        return answer;
    }
}

/*
// 2 == 0인 걸 answer 에 다 더하면 되잖아
*/