class Solution {
    public int solution(int[] num_list) {
        int even_sum = 0;
        int odd_sum = 0;
        // 근데 정수리스트의 길이를 구하는 게 .length인가?
        for (int i = 0; i < num_list.length; i++){
            if (i%2==0){
                odd_sum += num_list[i];
            } else {even_sum += num_list[i];
                   }
        }
        if (even_sum >= odd_sum){
            return even_sum;
        } else return odd_sum;
    }
}