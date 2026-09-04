class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        boolean success = false;
        for (int i = 0; i <= str1.length() - str2.length(); i++){
            for (int j = 0; j < str2.length(); j++){
                if (str1.charAt(i+j) != str2.charAt(j)){
                    success = false;
                    break;
                }
                success = true;
            }
            if (success) break;
        }
        if (success){
            return 1;
        } else {
            return 2;
        }
    }
}

// str2.charAt(0)이 있는지 탐색. 있다면 char 길이만큼 그 다음 것들이 있는지
// 반복문이 언제까지 가능한가? str1이 6이고 str2이 3이라면 i가 증가하다가 4일 때는 outofBound가 난다. 그래서 str1.length() - str2.length()까지만 비교