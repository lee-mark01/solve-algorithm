import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        List<Integer> answer = new ArrayList<>();
        int[] days = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++){
            days[i] = (100 - progresses[i] + speeds[i] -1) / speeds[i];
        }
        
        int max = days[0];
        int count = 1;

        for (int i = 1; i < days.length; i++){
            if (max >= days[i]) {
                count++;
            } else {
                answer.add(count);
                max = days[i];
                count = 1;
            }
        } 
        
        answer.add(count);
        
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++){
            result[i] = answer.get(i);
        }
        
        return result;
    }
}

// input: progresses 배열과 speeds 배열
// output: 몇개 기능이 묶어서 배포되는지의 배열.
// 예시: (100 - progresses[1]) / speeds[1] -> 7일 -> 이걸 저장.
// 다음 번 계산 결과와 비교 필요. 7일보다 크면 첫번째 배포때는 1개 배포. 7일보다 작으면 2개 배포
// 한번 쭉 저장 후 max로 빼서 if 크면 answer 배열에 1 넣고, max 올리기. else count ++, 그 다음 거 비교.
// 해보니깐 예외 발생. 올림을 해야함. 올림은 몫 - 1 만큼 더해주면 됨. 몫만큼 더하면 딱 떨어질 때도 올려버림.
// 처음에 답변 크기를 알 수 없기 때문에 ArrayList로 만들고, 배열로 옮겨담기.