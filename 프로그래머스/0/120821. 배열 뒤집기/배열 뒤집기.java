// 배열을 하나 만들어서, 기존 배열의 뒤에서부터 담으면 되지 않나?
// 그럼 크기를 알아야겠네. 배열의 크기. length()였던 것 같고

class Solution {
    public int[] solution(int[] num_list) {
        int size = num_list.length;
        int[] answer = new int[size];
        int j = 0;
        for (int i = size-1; i>=0; i--){
            answer[j] = num_list[i];
            j++;
        }
        return answer;
    }
}