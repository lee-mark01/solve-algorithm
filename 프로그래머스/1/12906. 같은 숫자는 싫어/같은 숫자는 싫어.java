import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>(); // 범위를 안정해도 넣을 수 있음.
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++){
            // 이전 값이랑 다르면 넣기. 같으면 넣지 않기
            if (arr[i-1] != arr[i]){
                list.add(arr[i]);
            }
        }
        // 리스트를 int 배열에 옮기기
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}