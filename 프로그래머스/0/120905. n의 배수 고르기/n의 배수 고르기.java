class Solution {
    public int[] solution(int n, int[] numlist) {
        int count = 0;
        for (int i=0; i<numlist.length; i++){
            if (numlist[i]%n == 0){
                count++;
            }
        }
        int[] answer = new int[count];
        count = 0;
        for (int i=0; i<numlist.length; i++){
            if (numlist[i]%n == 0){
                answer[count] = numlist[i];
                count++;
            }
        }
        
        return answer;
    }
}

// 그냥 n의 배수인 건 새로 담으면 되잖아. n으로 나눴을 때 나머지가 0인 거. 담으면 되잖아. 일단 개수 세고, 개수만큼 answer 크기. 그리고 반복문으로 카운트만큼 인덱스