class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        // 만약 1,2,3,4,5,6이고, num2가 6, num1이 4이라고 치면,
        // 
        int length = num2 - num1 + 1; // 3
        int[] answer = new int[length];
        for (int i=0; i <length; i++){ // 0, 1, 2
            answer[i] = numbers[num1 + i];
        }
        return answer;
    }
}

/*
정수 배열을 하나 만든 다음
for 문을 돌면서 num1부터 num2 + 1까지를 넣어주면 되는 거 아닌가?
배열에 값을 넣는 게 인덱스가 있어야하지? 그건 또 0부터인데 내 생각에는 그건 
*/