class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i] > max){
                max = array[i];
                answer[0] = max;
                answer[1] = i;
            }
        }
        return answer;
    }
}

// 인덱스 정보 필요, 값 필요 i 돌면서 제일 큰 max 값이랑 인덱스 배열에 담기