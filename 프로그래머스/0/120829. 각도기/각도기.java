class Solution {
    public int solution(int angle) {
        int answer = 0;
        if (0 < angle && angle < 90){
            answer = 1;
        } else if (angle == 90){
            answer = 2;
        } else if (90 < angle && angle < 180){
            answer = 3;
        } else if (angle == 180){
            answer = 4;
        }
        return answer;
    }
}

/*
완전 if else 문제네.
근데 수학처럼 0 < angle < 90는 안되고 
&& 연산자 써야하네
*/