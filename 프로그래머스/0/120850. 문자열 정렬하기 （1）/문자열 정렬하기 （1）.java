import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int count = 0;
        for (int i = 0; i < my_string.length(); i++){
            if (my_string.charAt(i) - '0' < 10){
                count++;
            }
        }
        
        int[] answer = new int[count];
        count = 0;
        for (int i = 0; i < my_string.length(); i++){
            if (my_string.charAt(i) - '0' < 10){
                answer[count] = my_string.charAt(i) - '0';
                count++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}

// 하나씩 뽑아서 '0'을 뺐을 때 10보다 작은 것만 넣으면 되네. 근데 개수 세야하니깐 count