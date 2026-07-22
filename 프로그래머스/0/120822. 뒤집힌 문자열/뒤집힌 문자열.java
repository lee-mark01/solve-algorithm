class Solution {
    public String solution(String my_string) {
        
        String answer = "";
        int size = my_string.length();
        for (int i = 0; i < size; i++){
            answer += my_string.charAt(size-i-1);
        }
        // 두 문자배열이 있는데 맨 뒤에 거를 꺼내서 넣기. 
        // .length()하면 5가 나올 거고, 그럼 -1이 마지막 거겠네. 그리고 0까지
        // for문으로 하면 되겠네
        
        return answer;
    }
}