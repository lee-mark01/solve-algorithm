class Solution {
    public long solution(long n) {
        // 시간 복잡도 때문에 반복문이 아니라, Math.sqrt()함수 사용
        long x = (long) Math.sqrt(n);
        if (x * x == n){
            return (x+1)*(x+1);
        } else {
            return -1;
        }
    }
}

// n 121 11(제곱근 판별법은 약수의 개수가 홀수였다고 했음. 1,11,121 즉, 만약 약수의 개수가 홀수라면, 
// 16 1,2,4,8,16 약수에서 중앙값인데? 짝수면 그냥 -1이고. ) -> 144. 그럼 일단 1부터 n까지 반복하면서 count 하고, count가 홀수일 때, count의 /2의 +1에서의 값을 출력