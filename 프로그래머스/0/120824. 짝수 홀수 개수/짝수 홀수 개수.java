class Solution {
    public int[] solution(int[] num_list) {
        // 길이만큼 for문을 돌려서 2로 나눠서 0이면 짝수 카운트 올리고, 1이면 홀 수 카운트 올리면 될 듯. odd랑, even
        int odd = 0; // 홀수 카운트
        int even = 0; // 짝수 카운트
        int size = num_list.length; // 리스트 길이(length 아니면 검색. 검색해보니 int[]는 int 배열이구나. 그리고 배열의 길이는 필드인 .length이고 String은 클래스의 메서드니깐 .length()
        
        for (int i = 0; i < size; i++){
            if (num_list[i]%2 == 0){
                even += 1;
            }
            else odd += 1;
        }
        int[] answer = { even, odd }; // 카운팅 된 수 담는 리스트
        return answer;
    }
}