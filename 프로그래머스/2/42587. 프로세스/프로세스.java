import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> queue = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++){
            queue.offer(new int[]{i, priorities[i]});
        }
        
        int[] front = new int[2];
        
        while (!queue.isEmpty()){
            boolean check = false;
            front = queue.poll();
            
            for (int[] process : queue){
                if (front[1] < process[1]){
                    check = true; // 뒤에 다시 추가
                    break;
                }
            }
            
            if (check) {
                queue.offer(front);
            } else {
                answer++;
                if (location == front[0]){
                    break;
                }
            }
        }
    
        
        return answer;
    }
}

// 입력: 우선순위 배열, 우선순위 알고싶은 배열의 위치
// 출력: location의 순서
// 예시: 큐에서 빼기. for each로 더 큰 게 있나 탐색. 있으면, 맨 뒤로 다시 넣기. 없으면 count++, location인지 확인 -> 맞으면 break. count 출력