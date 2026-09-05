class Solution {
    public int solution(String s) {
        return Integer.valueOf(s);
    }
}

// 맨 앞이 숫자이면 양수, +이면 양수, -이면 음수.
// 문자를 숫자로 바꾸는 법은 String.valueOf()였나