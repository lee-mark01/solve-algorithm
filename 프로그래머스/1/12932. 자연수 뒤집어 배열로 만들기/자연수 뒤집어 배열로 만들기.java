class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        int count = 0;
        while (n > 0){
            answer[count] = (int)(n%10);
            count++;
            n = n/10;
        }
        return answer;
    }
}

// 나누는 거 while 문으로 반복하는 걸로 나머지를 배열에 넣어야하나? 근데 처음에 그 길이를 어떻게 만들지? 아 숫자를 문자로 만들어서 그 length? 