class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n+1; i++){
            if (n%i==0){
                answer++;
            }
        }
        return answer;
    }
}
/*
20 은 1 20, 2 10, 4 5, 5 4, 10 2, 20 1
이거 음 1을 n만큼 올리면서, j도 n만큼 올려서 찾아봐야하나
이거 약수 개수 찾는 거네 
아 근데 그냥 n이 20인데, i를 1부터 20까지 올리면서 나눠서 나머지가 0인 게 몇개인지 ㅇㅋ
*/