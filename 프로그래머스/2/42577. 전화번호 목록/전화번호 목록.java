import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length-1; i++){
            if (phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }
        return true;
    }
}



// class Solution {
//     public boolean solution(String[] phone_book) {
//         boolean answer = true;
//         for (int i = 0; i < phone_book.length; i++){
//             for (int j = 0; j < phone_book.length; j++){
//                 if (i == j){
//                     continue;
//                 }
//                 if (phone_book[j].startsWith(phone_book[i])){
//                     answer = false;
//                     break;
//                 }
//             }
//         }
//         return answer;
//     }
// }

// for문으로 전원이 한번씩. 그리고 for문으로 전체를 자기 빼고 돈다. 