class Solution {
    public int[] solution(int n) {
        // 배열 크기 파악 (약수 개수 파악)
        int count = 0;
        for (int i=1; i < n+1; i++){
            if(n%i == 0){
                count++;
            }
        }
        
        int[] answer = new int[count];
        count = 0;
        for (int i=1; i < n+1; i++){
            if(n%i == 0){
                answer[count] += i;
                count++;
            }
        }        
        return answer;
    }
}