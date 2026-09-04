class Solution {
    public int solution(int hp) {
        int answer = 0;
        while (hp > 0){
            if (hp >= 5){
                answer += hp / 5;
                hp %= 5;
            } else if (hp >= 3){
                answer += hp / 3;
                hp %= 3;
            } else {
                answer += hp / 1;
                hp %= 1;
            }
        }
        return answer;
    }
}

// 5, 3, 1 5로 나눈 몫이 4, 나머지가 3 3으로 나눈 나머지가 0
// 몫은 따로 더하고, 나머지도 따로 기존 hp에 업데이트 하면 되겠네