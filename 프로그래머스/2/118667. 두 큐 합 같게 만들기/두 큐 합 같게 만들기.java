import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        
        // 두 배열을 받았다. 그런데 맨 끝에서 빼고 맨 앞으로 넣어줘야한다. 그리고 크기가 계속 동적으로 바뀐다.
        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();
        
        // 각 큐가 최종적으로 가져야할 목표값을 찾는다. 모두 다 더해서 반으로 나눈다.
        // 원소값이 10^9까지도 될 수 있기에 int가 아닌 long 타입을 사용한다
        long sum1 = 0;
        long sum2 = 0;
        
        for (int i = 0; i < queue1.length; i++){
            sum1 += queue1[i];
            q1.offer(queue1[i]); 
        }
        
        for (int j = 0; j < queue1.length; j++){
            sum2 += queue2[j];
            q2.offer(queue2[j]);
        }
        
        // 홀수면 불가능
        if ( (sum1 + sum2) % 2 == 1){
            return -1;
        }
        
        long target = (sum1 + sum2) / 2;
        // 종료조건이 애매하다. 원래대로 돌아오면 종료? 아니면 횟수로? 어떤 횟수가 될까?
        // gpt한테 물어봤더니 4 * n 으로 하라고 한다.. 왜일지는 좀 고민을 해봐야할 것 같다.
        int n = 4 * queue1.length;
        while (sum1 != sum2 && n > 0) {
            if (sum1 > sum2){
                int x = q1.poll();
                q2.offer(x);
                sum1 -= x;
                sum2 += x;
                answer++;
            } else {
                int x = q2.poll();
                q1.offer(x);
                sum1 += x;
                sum2 -= x;
                answer++;
            }
            n -= 1;
        }
        if (sum1 != sum2) {
            return -1;
        }
        return answer;
    }
}