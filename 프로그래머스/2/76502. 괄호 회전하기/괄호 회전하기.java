import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++){
            boolean success = true;
            Deque<Character> stack = new ArrayDeque<>();
            for (char c : s.toCharArray()){
                if (c == '(' || c == '{' || c == '['){
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty() || stack.peek() != '('){
                        success = false;
                        break;
                    }
                    if (stack.peek() == '('){
                        stack.pop();
                    } 
                } else if (c == '}') {
                    if (stack.isEmpty() || stack.peek() != '{'){
                        success = false;
                        break;
                    }
                    if (stack.peek() == '{'){
                        stack.pop();
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.peek() != '['){
                        success = false;
                        break;
                    }
                    if (stack.peek() == '['){
                        stack.pop();
                    }
                }
            } if (stack.isEmpty() && success){
                answer++;
            }
            String c1 = s.substring(0,1);
            String c2 = s.substring(1);
            s = c2.concat(c1);
        }
        
        return answer;
    }
}

// 검증. 어떻게? 맨 앞이 [야. 그럼 스택에 담아. 그리고 ] 이게 나오면 빼. 근데 만약 {가 나오면 또 담아. 근데 만약 }이런 오른쪽인 게 나왔는데 왼쪽 게 없으면 x -> 이걸 끝까지. 근데 종류가 [], (), {} 이렇게 3개니깐 여는 괄호면 -> push 닫는 괄호면 stack 확인 -> 짝이 맞으면 pop 아니면 fail.

// 문자열에서 맨 앞에 있는 걸 제거해서 맨 뒤로 이동. 이걸, 길이 - 1 만큼 반복.