class Solution {
    public int solution(int[][] sizes) {
        int max = 0;
        int submax = 0;
        for (int[]a : sizes){
            if (a[0]>a[1]){
                if (max < a[0]){
                    max = a[0];
                }
                if (submax < a[1]){
                    submax = a[1];
                }
            } else{
                if (max < a[1]){
                    max = a[1];
                }
                if (submax < a[0]){
                    submax = a[0];
                }
            }
        }
        
        return max * submax;
    }
}

