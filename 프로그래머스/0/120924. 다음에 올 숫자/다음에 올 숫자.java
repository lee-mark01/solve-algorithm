class Solution {
    public int solution(int[] common) {
        int answer = 0;
        if (common[0]-common[1] == common[1]-common[2]){
            answer = common[common.length - 1] + (common[1]-common[0]);
        } else {
            answer = common[common.length -1] * (common[1]/common[0]);
        }
        
        return answer;
    }
}

// 최소 3값을 알아야한다. 첫째, 둘째, 마지막을 알면 되지 않을까?
// common[0], common[1], common[2]
// 1,2랑의 차, 2,3의 차가 같다면 등차
// 아니면 등비
