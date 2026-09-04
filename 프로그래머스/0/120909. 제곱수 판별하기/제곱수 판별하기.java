class Solution {
    public int solution(int n) {
        int count = 0; 
        for (int i = 1; i <= n; i++){
            if (n%i==0){
                count++;
            }
        }
        if (count%2==1){
            return 1;
        } else {
            return 2;
        }
    }
}

// 제곱 수인지 아닌지 파악하는 법. 어떤 수를 제곱해서 그 값이 되는지 확인. 1,2,3,4,5,6,7,8,9, 언제까지? 1000까지,,,, 이거 오반데? 제곱수가 어떤 특성이 있더라? 약수가 홀수개래. 1부터 n까지로 나눴을 때의 약수가 홀수개이면 124816 16 