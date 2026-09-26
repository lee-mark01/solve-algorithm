import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        int answer = 0, idx = 0, time = 0, total_weight = 0;
        Queue<int[]> queue = new LinkedList<>();
        int[] front = new int[]{0,0};
        int max_idx = truck_weights.length;
        
        while (idx < truck_weights.length || !queue.isEmpty()){
            time++;
            if (!queue.isEmpty()){
                front = queue.peek();
            } 
            
            if (time - front[1] == bridge_length){
                total_weight -= front[0];
                queue.remove();
            }
            
            if (idx < max_idx && total_weight + truck_weights[idx] <= weight && queue.size() < bridge_length){
                queue.offer(new int[]{truck_weights[idx], time});
                total_weight += truck_weights[idx];
                idx++;
            }
        }
        return time;
    }
}

/*
1. 전체 시간을 매번 올린다.
2. 해당 시간에 빠져야할 애들은 빠진다. 빠질 때 전체 무게에서 빼고 온다.
3. 해당 인덱스의 무게를 현재 무게에 더해 비교한다. 크면 못들어오고, 작거나 같으면 들어온다. 들어올 때 현재 시간과 같이 들어오기. 그리고 들어올 때는 큐에 (무게, 들어온 시간)을 저장한다. queue.offer()
*/