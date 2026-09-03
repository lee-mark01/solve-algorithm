class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            for (int j = 0; j < n; j++){
                answer += c;
            }
        }
        return answer;
    }
}

/*
이것도 느낌적으로 replace 함수로 할 수 있을 것 같은데, 반복문을 돌면서 h -> h x n으로 대체, 그리고 n만큼 인덱스를 위로 올리기 뭐 이런 식으로 해야하나?
아니면 문자열을 하나 만들고 거기다 추가하는 방식으로 갈까?
*/