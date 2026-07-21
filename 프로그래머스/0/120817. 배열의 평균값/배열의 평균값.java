// 일단 배열을 for문으로 다 원소를 꺼내서 더하고 개수를 나누면 되는데, 
// 배열 자체에 뭐가 문법이 있을 것 같기는 해
class Solution {
    public double solution(int[] numbers) {
        int j = 0;
        int sum = 0;
        for (int i:numbers){
            sum += i;
            j += 1;
        }
        double answer = (double) sum / j;
        return answer;
    }
}