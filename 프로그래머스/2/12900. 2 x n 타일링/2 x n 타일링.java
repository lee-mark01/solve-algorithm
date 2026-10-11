class Solution {

    
    public int solution(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        
        if (n == 1){
            return dp[1] ;
        }
        if (n == 2){
            return dp[2];
        }
        int i = 3;
        
        while(i <= n) {
            
            dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
            i++;
        } 
        
        return dp[i-1];
    }
}