class Solution {
    public String solution(String my_string) {
        String answer = my_string.replace("a", "");
        answer = answer.replace("e", "");
        answer = answer.replace("i", "");
        answer = answer.replace("o", "");
        answer = answer.replace("u", "");
        return answer;
    }
}

// 문자열에서 특정 문자를 빼라 replace 쓰면 되지 않나?
// 근데 replace가 내부적으로 어떻게 동작할까? 정규식으로 파싱되겠지?