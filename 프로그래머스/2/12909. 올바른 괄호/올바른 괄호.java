import java.util.*;

class Solution {
    boolean solution(String s) {

        Deque<Character> stack = new ArrayDeque<>();
        
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else { // ')'일 때,
                // 만약 비어있다면
                if (stack.isEmpty()){
                    return false; // false 반환 후 종료
                } else { // 비어있지 않다면
                    stack.pop();
                }
            }
        }

        // 여기까지 왔을 때
        // stack이 비어있어야 성공
        if (stack.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}