class Solution {
    public int solution(int[][] info, int n, int m) {
        int answer = -1;
        
        // 물건을 어떤 과정을 통해 훔쳤는지는 중요하지 않다. 어떤 상태만 남아있는가가 중요하다
        boolean[][] dp = new boolean[n][m];
        dp[0][0] = true;
        
        for (int i = 0; i < info.length; i++){
            // 가능한 걸 체크. 근데 dp를 쓰지 않는 이유는 중복체크 방지
            boolean[][] nextDp = new boolean[n][m];
            
            for (int a = 0; a < n; a++){
                for (int b = 0; b < m; b++){
                    if (dp[a][b]){
                        if (a + info[i][0] < n){
                            nextDp[a + info[i][0]][b] = true; 
                        } 
                        if (b + info[i][1] < m){
                            nextDp[a][b + info[i][1]] = true;
                        }
                    }
                }
            }
            dp = nextDp;
        }
        
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (dp[i][j]) {
                    answer = i;
                    break;
                }
            } if (answer != -1){
                break;
            }
        }
        return answer;
    }
}

// a b A에 대한 흔적을 n개만큼, 어떻게 흔적 남기지? 1~3개 흔적 남긴대.
// 최소화? -> dp or 그리디?
// 누적할 때 n개 이상인지 m개 이상인지 비교.
// 이거 dp네.
// 음, 일단 3개를 무조건 훔쳐야한다. 경우의 수를 세보자. A가 3, B가 1 으로 만들거나, A가 2, B가 3. 근데 목표는 A 도둑의 흔적을 최소화하면서 통과하는 것.
// 그니깐 A가 적은 거를 먼저 가지면서 통과하면 된다.
// 1 -> 2 -> 2 -> 1,2 -> 2,2 -> 1,2 -> 1,2,3


/*
사실 이 문제가 그리디 혹은 dp 알고리즘으로 풀어야하는 문제라는 것을 어렴풋이 알았습니다. 어디선가 그리디, dp는 최솟값, 최댓값을 구할 때 사용한다는 것을 들었기 때문입니다.

그런데 사실 해결과정을 알지는 못해서 그 방법은 포기했습니다. 그래서 이 경우의 수를 완전탐색을 생각했습니다. 그런데 물건이 2개일 때 경우의 수는 4, 3개일 때 8, 즉 2^k가짓수가 존재하고, 물건이 40개라면 2^40가지 경우의 수가 존재해서 시간 초과가 난다고 판단했습니다.

gpt한테 물어봤습니다. gpt도 dp를 사용해야한다고 했습니다. 왜냐하면 모든 선택 과정을 기억할 필요가 없다고 합니다. 물건을 몇개 훔쳤든 a흔적이 4, b흔적이 3이라면 어떻게 4,3에 도달했는지는 중요하지 않다고 합니다. 그래서 dp[a][b]를 a
*/
