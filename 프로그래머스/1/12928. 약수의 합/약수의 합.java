class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++){
            if (n%i==0){
                answer +=i;
            }
        }
        return answer;
    }
}

// 약수는 무조건 0부터 n까지 돌아서 나머지 0인 값. 그걸 다 더한다라