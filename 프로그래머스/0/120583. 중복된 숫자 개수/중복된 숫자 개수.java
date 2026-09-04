class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int i=0; i < array.length; i++){
            if (array[i] == n){
                answer++;
            }
        }
        return answer;
    }
}
// array 길이만큼 돌면서 n과 같으면 count ++ 하면 되잖아