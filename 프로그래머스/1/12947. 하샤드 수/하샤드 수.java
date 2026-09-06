class Solution {
    public boolean solution(int x) {
        int n = x;
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            n = n / 10;
        }
        if (x % sum == 0){
            return true;
        } else {
            return false;
        }
    }
}

// 몫과 나머지 더하기로 합을 구하고, 그걸 나눴을 때 나머지가 0이면 하샤드. 판별
