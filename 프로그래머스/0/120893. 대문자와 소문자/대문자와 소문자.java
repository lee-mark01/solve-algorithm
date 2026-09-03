class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if (c - 'a' < 0) {
                // 대문자
                answer += (char) (c + 32);
            } else {
                // 소문자
                answer += (char) (c - 32);
            }
        }
        return answer;
    }
}

// 딱봐도 아스키코드 활용하는 문제. 만약 숫자 '0'이 '0'을 빼면 0이니깐, a 랑 A 아스키코드 65 97 그니깐 'a'를 뺐을 때 0과 같거나 크면 소문자네. 만약 빼서 0보다 작으면 대문자. 65가 A야. 그럼 32를 더하면 a 그럼 소문자면 32를 빼면 A